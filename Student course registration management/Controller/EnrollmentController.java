package com.example.StudentCourseRegistationWebsite.Controller;

import com.example.StudentCourseRegistationWebsite.EnrollmentRequest;
import com.example.StudentCourseRegistationWebsite.Model.CourseModel;
import com.example.StudentCourseRegistationWebsite.Model.EnrollmentModel;
import com.example.StudentCourseRegistationWebsite.Model.StudentModel;
import com.example.StudentCourseRegistationWebsite.Service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/api/Enrollment")
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;
    @GetMapping("/course/{courseId}/students")
    public ResponseEntity<List<?>> getStudentByCourseId(@PathVariable String courseId){
        List<?> students=enrollmentService.getStudentByCourseId(courseId);
        return ResponseEntity.ok(students);
    }
    @GetMapping("/student/{studentId}/courses")
    public ResponseEntity<List<?>> getCourseByStudentId(@PathVariable Long studentId){
        List<?> courses=enrollmentService.getCourseByStudentId(studentId);
        return ResponseEntity.ok(courses);
    }
    @GetMapping("/allEnrollment")
    public ResponseEntity<List<EnrollmentModel>> getAllEnrollment(){
        List<EnrollmentModel> enrollmentModelList=enrollmentService.getAllEnrollment();
        return ResponseEntity.ok(enrollmentModelList);
    }
    @Transactional
    @PostMapping("/enroll")
    public ResponseEntity<String> enrollStudent(@RequestBody EnrollmentRequest enrollmentRequest) {
        if (enrollmentRequest == null || enrollmentRequest.getStudentId() == null || enrollmentRequest.getCourseId() == null) {
            return ResponseEntity.badRequest().body("Invalid request: Missing studentId or courseId.");
        }

        boolean enrolled = enrollmentService.enrollStudent(enrollmentRequest.getStudentId(), enrollmentRequest.getCourseId());

        return enrolled ? ResponseEntity.ok("Enrollment successful!")
                : ResponseEntity.status(400).body("Enrollment failed: Student or Course not found.");
    }

}
