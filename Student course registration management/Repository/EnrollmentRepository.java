package com.example.StudentCourseRegistationWebsite.Repository;

import com.example.StudentCourseRegistationWebsite.Model.EnrollmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<EnrollmentModel,Long> {
    List<EnrollmentModel> findByCourse_CourseId(String courseId);

    List<EnrollmentModel> findByStudent_StudentId(Long studentId);

    boolean existsByStudent_StudentIdAndCourse_CourseId(Long studentId, String courseId);
}
