//Create a class Person with:
//name (public)
//age (protected)
//address (default)
//salary (private)
//Create a subclass Employee in the same package to demonstrate which members are accessible.
//Create another class TestAccess in a different package to test accessibility.

package Employee;
public class Person {
    public String name;
    protected int age;
    String address;
    private double salary;

    public Person(String address, String name, int age, double salary) {
        this.address = address;
        this.name = name;
        this.age = age;
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }
}


