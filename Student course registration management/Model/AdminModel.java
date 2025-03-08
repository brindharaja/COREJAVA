package com.example.StudentCourseRegistationWebsite.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AdminModel {
    @Id
    private String adminId;
    private String adminPassword;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
