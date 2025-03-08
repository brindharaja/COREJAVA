package com.example.StudentCourseRegistationWebsite.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class StudentModel {
    @Id
    @Column(unique = true, nullable = false)
    private Long studentId;
    private String studentEmail;
    private String studentPassword;
    private String studentInstitution;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentInstitution() {
        return studentInstitution;
    }

    public void setStudentInstitution(String studentInstitution) {
        this.studentInstitution = studentInstitution;
    }
}
