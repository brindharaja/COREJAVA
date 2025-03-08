package com.example.StudentCourseRegistationWebsite.Service;

import com.example.StudentCourseRegistationWebsite.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;
    public boolean login(String adminId, String adminPassword) {
        return adminRepository.findById(adminId).map(adminModel -> adminModel.getAdminPassword().equals(adminPassword)).orElse(false);
    }
}
