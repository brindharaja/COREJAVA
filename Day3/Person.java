public class Person {
    public String name;
    public int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void pdisplay(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
    }
}
class Student extends Person {
    int rollNumber;
    int marks;

    Student(String name, int age, int rollNumber, int marks) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void sdisplay() {
        pdisplay();
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks: " + marks);
    }

    public static void main(String[] args){
        Student ps=new Student("bindu",20,7315013,80);
        ps.sdisplay();
    }
}
//Create a class Person with attributes name and age.
// Derive a class Student that adds rollNumber and marks.
// Write methods to display both Person and Student details.
