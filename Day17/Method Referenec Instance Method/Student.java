//Create a Student class with fields name and marks.
//Write an instance method displayStudentDetails in the Student class to print the student's details.
//Use a method reference to call this method for each student in a list.

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int marks;
    Student(String name,int marks) {
        this.name=name;
        this.marks=marks;
    }
    public void display(){
        System.out.println(name+" : "+marks);
    }
    public static void main(String[] args){
        List<Student> list=new ArrayList<>();
        Student student1=new Student("Alice",85);
        Student student2=new Student("Bob",80);
        Student student3=new Student("Eve",90);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.forEach(Student::display);
    }
}
