//Write a program that:
//Accepts two integers from the user as input.
//Attempts to divide the first integer by the second.
//Implements exception handling to manage the following scenarios:
//Division by zero: Display an error message "Error: Division by zero is not allowed.".
//Invalid input: Display an error message "Error: Please enter valid integers.".
//Any other exceptions: Display "An unexpected error occurred.".

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int res=num1/num2;
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }catch(java.util.InputMismatchException e){
            System.out.println("Error: Please enter valid integers.");
        }catch(Exception e){
            System.out.println("An unexpected error occurred.");
        }
    }
}
