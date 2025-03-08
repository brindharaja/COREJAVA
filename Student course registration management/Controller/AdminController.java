package com.example.StudentCourseRegistationWebsite.Controller;

import com.example.StudentCourseRegistationWebsite.Model.AdminModel;
import com.example.StudentCourseRegistationWebsite.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;
    @PostMapping("admin/login")
    public ResponseEntity<String> login(@RequestBody AdminModel adminModel){
        if(adminService.login(adminModel.getAdminId(),adminModel.getAdminPassword())){
            return ResponseEntity.ok("Admin logged...");
        }
        else{
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
