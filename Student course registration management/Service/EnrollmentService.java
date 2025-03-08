package com.example.StudentCourseRegistationWebsite.Service;

import com.example.StudentCourseRegistationWebsite.Model.CourseModel;
import com.example.StudentCourseRegistationWebsite.Model.EnrollmentModel;
import com.example.StudentCourseRegistationWebsite.Model.StudentModel;
import com.example.StudentCourseRegistationWebsite.Repository.CourseRepository;
import com.example.StudentCourseRegistationWebsite.Repository.EnrollmentRepository;
import com.example.StudentCourseRegistationWebsite.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnrollmentService {
    @Autowired
    EnrollmentRepository enrollmentRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CourseRepository courseRepository;
    public List<StudentModel> getStudentByCourseId(String courseId) {
        return enrollmentRepository.findByCourse_CourseId(courseId).stream().map(EnrollmentModel::getStudentModel).collect(Collectors.toList());
    }

    public List<CourseModel> getCourseByStudentId(Long studentId) {
        return enrollmentRepository.findByStudent_StudentId(studentId).stream().map(EnrollmentModel::getCourseModel).collect(Collectors.toList());
    }

    public List<EnrollmentModel> getAllEnrollment() {
        return enrollmentRepository.findAll();
    }
    @Transactional
    public boolean enrollStudent(Long studentId, String courseId) {
        if (enrollmentRepository.existsByStudent_StudentIdAndCourse_CourseId(studentId, courseId)) {
            System.out.println("Student already enrolled in this course!");
            return false;
        }
        Optional<StudentModel> studentOpt = studentRepository.findById(studentId);
        Optional<CourseModel> courseOpt = courseRepository.findById(courseId);

        if (studentOpt.isPresent() && courseOpt.isPresent()) {
            StudentModel student = studentOpt.get();
            CourseModel course = courseOpt.get();

            // ✅ Debugging logs
            System.out.println("Fetched Student: " + student.getStudentEmail());
            System.out.println("Fetched Course: " + course.getCourseName());

            EnrollmentModel enrollment = new EnrollmentModel();
            enrollment.setStudentModel(student);
            enrollment.setCourseModel(course); // ✅ Ensure course is set
            enrollment.setEnrollmentDateTime(LocalDateTime.now());

            enrollmentRepository.save(enrollment);
            System.out.println("Enrollment saved successfully!");
            return true;
        } else {
            if (studentOpt.isEmpty()) {
                System.out.println("Enrollment failed: Student not found.");
            }
            if (courseOpt.isEmpty()) {
                System.out.println("Enrollment failed: Course not found.");
            }
        }
        return false;
    }
}
