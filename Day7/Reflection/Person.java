//Write a Java program to demonstrate the use of reflection. Your program should:
//Dynamically load a custom class (e.g., Person) using its fully qualified name.
//Display the following details about the class:
//All declared methods and their return types.
//All declared fields and their types.
//All constructors.
//Dynamically invoke a method on an object of the class, provided the method name and arguments as input.

public class Person {
    String name;
    int age;

    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        System.out.println("GetName Invoked");
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }




}
