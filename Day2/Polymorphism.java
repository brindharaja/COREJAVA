import java.util.Scanner;

public class Polymorphism {
    public int add(int x,int y){
        return (x+y);
    }
    public double add(double x,double y){
        return (x+y);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Polymorphism cal=new Polymorphism();
        System.out.println(cal.add(2,2));
        System.out.println(cal.add(2.5,2.5));
    }
}
