//Perform basic mathematical operations like finding the square root, power, and maximum of two numbers.

import java.util.Scanner;

public class MathExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Square Root of num1: "+(int) Math.sqrt(num1) + " Square Root of num2: "+(int) Math.sqrt(num2));
        System.out.println("Power : "+(int) Math.pow(num1,num2));
        System.out.println("Max Value : "+Math.max(num1,num2));
    }
}
