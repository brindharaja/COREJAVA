package com.example.StudentCourseRegistationWebsite;

// EnrollmentRequest.java
public class EnrollmentRequest {
    private Long studentId;
    private String courseId;

    // Constructors
    public EnrollmentRequest() {}

    public EnrollmentRequest(Long studentId, String courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    // Getters and Setters
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
