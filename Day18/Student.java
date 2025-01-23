//Practice problems:
//This project is about analyzing the performance of students in different departments using Java Streams.
//Here's the step-by-step explanation:
//Imagine we have students in three departments (like Computer Science, Mathematics, and Physics). Each student has:
//A name (e.g., "John"),
//Marks for 5 subjects (e.g., 85, 90, 78, etc.),
//A grade (to be calculated based on their average marks).
//We want to:
//Find the top 3 students based on their average marks.
//Assign a grade (A, B, C, D) to each student based on their average marks.
//Find the average marks for each department.
//Identify the top student in each department.
//Count how many students failed in each department (average marks < 50).

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    String name;
    String department;
    List<Integer> marks;
    public Student(String name, String department, List<Integer> marks) {
        this.name = name;
        this.department = department;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public List<Integer> getMarks() {
        return marks;
    }
    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }
    public double getAverageMarks() {
        return marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
    public String getGrade() {
        double avg = getAverageMarks();
        if (avg >= 80) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "D";
    }
    public static void main(String[] args) {
        Student student1=new Student("Alice","Computer Science", Arrays.asList(85,80,90,95,60));
        Student student2=new Student("Bob","Computer Science", Arrays.asList(82,82,92,95,70));
        Student student3=new Student("John","Mathematics", Arrays.asList(30,0,0,60,30));
        Student student4=new Student("Eve","Mathematics", Arrays.asList(85,80,70,85,60));
        Student student5=new Student("Aana","Physics", Arrays.asList(80,88,98,95,60));
        Student student6=new Student("Alex","Physics", Arrays.asList(85,80,91,95,70));
        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        List<Student> top3Students = studentList.stream().sorted(Comparator.comparingDouble(Student::getAverageMarks).reversed()).limit(3).collect(Collectors.toList());
        top3Students.forEach(s -> System.out.println(s.name + " - " + s.marks.stream().mapToInt(Integer::intValue).average().orElse(0.0)));
        Map<String,Double> avgDept = studentList.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.averagingDouble(Student::getAverageMarks)));
        avgDept.forEach((dept,avg)->System.out.println(dept+" : "+avg));
        Map<String, Optional<Student>> topStudentByDept = studentList.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Student::getAverageMarks))));
        topStudentByDept.forEach((dept,name)->System.out.println(dept+":"+name.map(Student::getName)));
        Map<String, Long> failedCount= studentList.stream().filter(s -> s.getAverageMarks() < 50).collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
        failedCount.forEach((dept,count)->System.out.println(dept+":"+count));
    }
}