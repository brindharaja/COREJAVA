public class Vehicle {
    public void start(){
        System.out.println("Vehicle class");
    }
}
class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Child class");
    }
}
class Main{
    public static void main(String[] args){
        Vehicle vehicle=new Vehicle();
        vehicle.start();
        Vehicle Vcar=new Car();
        Vcar.start();
        Car car=new Car();
        car.start();
    }
}
