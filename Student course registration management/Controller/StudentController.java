package com.example.StudentCourseRegistationWebsite.Controller;

import com.example.StudentCourseRegistationWebsite.Model.StudentModel;
import com.example.StudentCourseRegistationWebsite.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/student/{studentId}")
    public ResponseEntity<StudentModel> getStudentById(@PathVariable Long studentId) {
        StudentModel student = studentService.findById(studentId);
        return ResponseEntity.ok(student);
    }
    @PostMapping("student/register")
    public ResponseEntity<String> register(@RequestBody StudentModel studentModel){
        if (studentService.studentIdExists(studentModel.getStudentId())){
            return ResponseEntity.status(400).body("Student ID already exists.");
        }
        if(!studentModel.getStudentEmail().matches("^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-z]+\\.(com|org|net)$")) {
            return ResponseEntity.status(400).body("Email invalid..");
        }
        if(!studentModel.getStudentPassword().matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")){
            return ResponseEntity.status(400).body("Password invalid..");
        }
        studentService.register(studentModel);
        return ResponseEntity.ok("Registered Successfully..");
    }
    @PutMapping("student/profile")
    public ResponseEntity<String> editProfile(@RequestBody StudentModel studentModel){
        studentService.editProfile(studentModel);
        return ResponseEntity.ok("Profile Edited Successfully");
    }

    @PostMapping("student/login")
    public ResponseEntity<String> login(@RequestBody StudentModel studentModel){
        if(studentService.login(studentModel.getStudentId(),studentModel.getStudentPassword()).isPresent()){
            return ResponseEntity.ok("Student logged successfully..");
        }
        return ResponseEntity.status(401).body("Invalid credentials");
    }
}
