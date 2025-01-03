package Employee;

public class Employee extends Person{
    public Employee(String address, String name, int age, double salary) {
        super(address, name, age, salary);
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(getSalary());
        System.out.println(address);
    }
}
