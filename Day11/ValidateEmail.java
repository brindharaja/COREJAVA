//Task: Write a Java program to validate a list of email addresses using regular expressions.
//The program should:
//Accept a list of email addresses as input.
//Validate each email address against the following rules:
//It must start with a letter or a number.
//It can include letters, numbers, dots (.), hyphens (-), and underscores (_).
//The domain name should be valid, ending with .com, .org, or .net.
//Print whether each email address is valid or invalid.

import java.util.Scanner;
import java.util.regex.*;
public class ValidateEmail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();
        boolean isValid=email.matches("^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-z]+\\.(com|org|net)$");
        System.out.println(isValid);

    }
}