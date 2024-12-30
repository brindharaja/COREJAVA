import java.util.*;
public class Car {
    String brand;
    String model;
    int price;
    Car(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: "+ price);
    }
    public double calculatediscount(int discountper){
        int p=price-(price*discountper/100);
        return p;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String brand=sc.nextLine();
        String model=sc.nextLine();
        int price=sc.nextInt();
        Car car=new Car(brand,model,price);
        int discountper=sc.nextInt();
        car.displayDetails();
        System.out.print(car.calculatediscount(discountper));

    }
}
