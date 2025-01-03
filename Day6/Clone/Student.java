//Create a class Student with fields for the name and age.
// Write a program to create a clone (copy) of a Student object using the clone() method.

public class Student implements Cloneable{
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println(name+" : "+age);
    }

    public static void main(String[] args){
        try {
            Student clone1 = new Student("Brindha", 20);
            Student clone2 = (Student) clone1.clone();
            clone2.display();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
