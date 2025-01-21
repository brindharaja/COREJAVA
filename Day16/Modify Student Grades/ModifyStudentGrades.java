//Modify Student Grades
//Write a program that accepts a Consumer<Student> to increase each student's grade by 10.
//Define a Student class and modify a list of Student objects.
//Input:
//John: 70
//Alice: 60
//Output :
//John: 80
//Alice: 70

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ModifyStudentGrades {
    String name;
    int grade;
    public ModifyStudentGrades(String name, int grade) {
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
        ModifyStudentGrades student1 =new ModifyStudentGrades("Alice",85);
        ModifyStudentGrades student2 =new ModifyStudentGrades("Bob",82);
        ModifyStudentGrades student3 =new ModifyStudentGrades("Eve",60);
        List<ModifyStudentGrades> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Consumer<ModifyStudentGrades> consumer=(student)->student.setGrade(student.getGrade()+10);
        printIncreasedGrade(list,consumer);
        list.forEach(student -> System.out.println(student.getName() + ": " + student.getGrade()));
    }
    public static void printIncreasedGrade(List<ModifyStudentGrades> list,Consumer<ModifyStudentGrades> consumer){
        for(ModifyStudentGrades student:list){
            consumer.accept(student);
        }
    }
}
