//Write a program that:
//Takes two strings as input from the user.
//Compares them lexicographically using compareTo() method.
//Checks if the two strings are equal (case-sensitive and case-insensitive).
//Concatenates the two strings and prints the result.

import java.util.Scanner;

public class StringB {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println("lexicographically :"+lexicography(str1,str2));
        System.out.println("Two strings are equal (case-sensitive) :"+Equal(str1,str2));
        System.out.println("Two strings are equal (case-insensitive) :"+str1.equalsIgnoreCase(str2));
        System.out.println("Concatenates the two strings :"+concatenate(str1,str2));
    }
    public static int lexicography(String str1,String str2){
        return str1.compareTo(str2);
    }
    public static boolean Equal(String str1,String str2){
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
    public static String concatenate(String str1,String str2){
        return str1+str2;
    }
}
