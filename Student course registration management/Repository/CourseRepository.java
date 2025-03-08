package com.example.StudentCourseRegistationWebsite.Repository;

import com.example.StudentCourseRegistationWebsite.Model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CourseRepository extends JpaRepository<CourseModel,String> {
    List<CourseModel> findByCourseName(String courseName);
}
