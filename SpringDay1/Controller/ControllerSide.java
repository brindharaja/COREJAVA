package com.example.demo3.Controller;

import com.example.demo3.Model.Student;
import com.example.demo3.Service.ServiceSide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerSide {
    @Autowired
    ServiceSide service;
    @GetMapping("/students")
    public List<Student> getStudents(){
        return service.getStudents();
    }
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }
    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
        return service.deleteStudent(id);
    }
}
