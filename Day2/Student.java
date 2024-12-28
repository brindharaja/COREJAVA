import java.util.*;
public class Student {
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
    public static void main(String[] args){
        Student student=new Student("Bindu",20);
        student.display();
    }
}
