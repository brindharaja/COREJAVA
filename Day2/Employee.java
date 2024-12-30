import java.util.*;
public class Employee {
    int id;
    String name;
    double Salary;
    Employee(int id,String name,double Salary){
        this.id=id;
        this.name=name;
        this.Salary=Salary;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getSalary(){
        return this.Salary;
    }
    public void setSalary(double Salary){
        this.Salary=Salary;
    }
    public void display() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.Salary);
    }
    public static void main(String[] args){
        Employee emp=new Employee(13,"Bindu",50000);
        emp.display();
        emp.setName("Brindha");
        emp.setSalary(60000);
        emp.display();
    }
}
