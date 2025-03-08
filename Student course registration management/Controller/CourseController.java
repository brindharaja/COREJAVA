package com.example.StudentCourseRegistationWebsite.Controller;

import com.example.StudentCourseRegistationWebsite.Model.CourseModel;
import com.example.StudentCourseRegistationWebsite.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/api/admin")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("/course/add")
    public ResponseEntity<String> addCourse(@RequestBody CourseModel course) {
        if(courseService.courseIDExists(course.getCourseId())){
            return ResponseEntity.status(400).body("Course already exists.");
        }
        courseService.addCourse(course);
        return ResponseEntity.status(HttpStatus.CREATED).body("");
    }

    @GetMapping("/course/get")
    public ResponseEntity<List<CourseModel>> getCourse() {
        List<CourseModel> courses = courseService.getAllCourse();
        if (courses.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.emptyList());
        }
        return ResponseEntity.ok(courses);
    }

    @GetMapping("/course/get/{courseName}")
    public ResponseEntity<List<CourseModel>> getCourseByName(@PathVariable String courseName){
        List<CourseModel> courses=courseService.getCourseByName(courseName);
        if(courses.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.emptyList());
        }
        return ResponseEntity.ok(courses);
    }

    @DeleteMapping("/course/{courseId}")
    public ResponseEntity<String> deleteCourseById(@PathVariable String courseId){
        if(courseService.courseIDExists(courseId)) {
            courseService.deleteCourseById(courseId);
            return ResponseEntity.ok("Deleted");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found");
    }

}
