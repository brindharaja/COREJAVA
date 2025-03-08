package com.example.StudentCourseRegistationWebsite.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "enrollment_model")
public class EnrollmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentId;

    @ManyToOne(fetch = FetchType.EAGER) // ✅ Ensure course is fetched
    @JoinColumn(name = "student_id", nullable = false)
    private StudentModel student;

    @ManyToOne(fetch = FetchType.EAGER) // ✅ Prevent course from being null
    @JoinColumn(name = "course_id", nullable = false)
    private CourseModel course;

    private LocalDateTime enrollmentDateTime;

    public EnrollmentModel() {}

    public EnrollmentModel(StudentModel student, CourseModel course) {
        this.student = student;
        this.course = course;
        this.enrollmentDateTime = LocalDateTime.now();
    }

    public Long getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Long enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public StudentModel getStudentModel() {
        return student;
    }

    public void setStudentModel(StudentModel student) {
        this.student = student;
    }

    public CourseModel getCourseModel() {
        return course;
    }

    public void setCourseModel(CourseModel course) {
        this.course = course;
    }

    public LocalDateTime getEnrollmentDateTime() {
        return enrollmentDateTime;
    }

    public void setEnrollmentDateTime(LocalDateTime enrollmentDateTime) {
        this.enrollmentDateTime = enrollmentDateTime;
    }
}
