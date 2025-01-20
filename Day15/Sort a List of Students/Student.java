//Sort a List of Students
//Write a method that takes a list of Student objects and sorts them by their GPA in descending order
//using a lambda expression.

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    String name;
    double gpa;
    public Student(String name,double gpa) {
        this.name = name;
        this.gpa=gpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name+":"+gpa;
    }

    public static void main(String[] args){
        Student student1=new Student("Brindha",8.19);
        Student student2=new Student("Jo",8.1);
        Student student3=new Student("Gokul",8.5);
        Student student4=new Student("darunika",8.9);
        ArrayList<Student> arrList=new ArrayList<Student>();
        arrList.add(student1);
        arrList.add(student2);
        arrList.add(student3);
        arrList.add(student4);
        Collections.sort(arrList,(stu1,stu2)->Double.compare(stu2.getGpa(),stu1.getGpa()));
        System.out.println(arrList.toString());
    }
}