// Manipulate a string by finding its length, converting it to uppercase, and extracting a substring.

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("String length : "+str.length());
        System.out.println("Convert to Uppercase : "+str.toUpperCase());
        System.out.println("Extracting substring : "+str.substring(2,4));
    }
}
