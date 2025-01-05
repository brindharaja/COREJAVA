//Write a Java program that takes two numbers as input from the user and divides the first number by the second.
// Handle the following exceptions:
//ArithmeticException: If the second number is zero, display an error message: "Division by zero is not allowed."
//InputMismatchException: If the user enters non-numeric input, display an error message: "Invalid input. Please enter numeric values."
//General Exception: For any other unexpected errors, display a generic error message: "An error occurred: [error message]."

import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int res=num1/num2;
            if(num2==0){
                throw new ArithmeticException();
            }if(!sc.hasNextInt()){
                throw new InputMismatchException();
            }else{
                System.out.println(res);
                return;
            }
        }catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter numeric values.");
        }catch(Exception e) {
            System.out.println("Exception error");
        }
    }
}
