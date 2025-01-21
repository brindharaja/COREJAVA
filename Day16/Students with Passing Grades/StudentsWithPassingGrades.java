//Students with Passing Grades
//Write a function that accepts a Predicate<Student> to filter students with grades above 60. Define a Student class with fields like name and grade.
//Input:
//John: 75
//Alice: 55
//Mark: 88
//Output: John, Mark

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentsWithPassingGrades {
    String name;
    int grade;
    public StudentsWithPassingGrades(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public static void main(String[] args){
        StudentsWithPassingGrades student1 =new StudentsWithPassingGrades("Alice",85);
        StudentsWithPassingGrades student2 =new StudentsWithPassingGrades("Bob",82);
        StudentsWithPassingGrades student3 =new StudentsWithPassingGrades("Eve",60);
        List<StudentsWithPassingGrades> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Predicate<StudentsWithPassingGrades> predicate=(studentone)->studentone.getGrade()>60;
        printName(list,predicate);
    }
    public static void printName(List<StudentsWithPassingGrades> list, Predicate<StudentsWithPassingGrades> predicate){
        for(StudentsWithPassingGrades name:list){
            if(predicate.test(name)){
                System.out.println(name.getName());
            }
        }
    }
}
