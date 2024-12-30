public class Employee {
    public void calculateSalary(){
        System.out.println("TO Calculate Salary");
    }
}
class Manager extends Employee{
    public void calculateSalary(){
        System.out.println("50000.00");
    }
}
class Developer extends Employee{
    public void calculateSalary(){
        System.out.println("35000.00");
    }
}
class Employeemain{
    public static void main(String[] args){
        Employee emp1=new Manager();
        emp1.calculateSalary();
        Employee emp2=new Developer();
        emp2.calculateSalary();
    }
}
