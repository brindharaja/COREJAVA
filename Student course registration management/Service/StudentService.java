package com.example.StudentCourseRegistationWebsite.Service;

import com.example.StudentCourseRegistationWebsite.Model.StudentModel;
import com.example.StudentCourseRegistationWebsite.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void register(StudentModel studentModel) {
        studentRepository.save(studentModel);
    }
    public Optional<StudentModel> login(Long studentId, String studentPassword) {
        return studentRepository.findById(studentId).filter(studentModel -> studentModel.getStudentPassword().equals(studentPassword));
    }

    public boolean studentIdExists(Long studentId) {
        return studentRepository.existsByStudentId(studentId);
    }

    public void editProfile(StudentModel studentModel) {
        studentRepository.save(studentModel);
    }

    public StudentModel findById(Long studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + studentId));
    }

}