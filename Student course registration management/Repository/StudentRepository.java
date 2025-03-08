package com.example.StudentCourseRegistationWebsite.Repository;

import com.example.StudentCourseRegistationWebsite.Model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel,Long> {
    boolean existsByStudentId(Long studentId);
}
