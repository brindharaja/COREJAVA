//Method Reference Constructor :
//Create a functional interface StudentFactory that contains a method create(String name, int marks).
//Use a constructor reference to implement this method to create Student objects.

import java.util.function.BiFunction;

public class StudentFactory {
    String name;
    int marks;
    public StudentFactory(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public static void main(String[] args){
        BiFunction<String,Integer,StudentFactory> biFunction=StudentFactory::new;
        StudentFactory studentFactory=biFunction.apply("Alice",85);
        System.out.println(studentFactory.getName()+":"+studentFactory.getMarks());
    }
}
