package com.example.StudentCourseRegistationWebsite.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_model")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CourseModel {

    @Id
    @Column(unique = true, nullable = false)
    private String courseId;
    private String courseName;
    private String courseDescription;
    private int courseDuration;
    private String courseInstructor;

    public CourseModel() {}

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public CourseModel(String courseId, String courseName, String courseDescription, int courseDuration, String courseInstructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDuration = courseDuration;
        this.courseInstructor = courseInstructor;
    }
}
