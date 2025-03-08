package com.example.StudentCourseRegistationWebsite.Service;

import com.example.StudentCourseRegistationWebsite.Model.CourseModel;
import com.example.StudentCourseRegistationWebsite.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;
    public void addCourse(CourseModel courseModel) {
        courseRepository.save(courseModel);
    }

    public List<CourseModel> getAllCourse() {
        return courseRepository.findAll();
    }

    public boolean courseIDExists(String courseId) {
        return courseRepository.existsById(courseId);
    }

    public List<CourseModel> getCourseByName(String courseName) {
        return courseRepository.findByCourseName(courseName);
    }

    public void deleteCourseById(String courseId) {
        courseRepository.deleteById(courseId);
    }
}
