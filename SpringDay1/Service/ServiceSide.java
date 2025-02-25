package com.example.demo3.Service;

import com.example.demo3.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ServiceSide {
    List<Student> listStudent=new ArrayList<>(
            Arrays.asList(
                    new Student("Alice",10,"IT"),
                    new Student("Bob",11,"CSE")
            ));
    public List<Student> getStudents() {
        return listStudent;
    }

    public Student getStudentById(int id) {
        boolean b=true;
        int index=0;
        for(int i=0;i<listStudent.size();i++)
        {
            if(listStudent.get(i).getId()==id){
                b=false;
                index=i;
            }
        }
        return listStudent.get(index);
    }

    public String addStudent(Student student) {
        listStudent.add(student);
        return "Success";
    }

    public String updateStudent(Student student) {
        int index=0;
        for(int i=0;i<listStudent.size();i++){
            if(listStudent.get(i).getId()==student.getId()){
                index=i;
                break;
            }
        }
        listStudent.set(index,student);
        return "updateSuccess";
    }

    public String deleteStudent(int id) {
        for(int i=0;i<listStudent.size();i++){
            if(listStudent.get(i).getId()==id){
                listStudent.remove(i);
                break;
            }
        }
        return "deleteSuccess";
    }
}
