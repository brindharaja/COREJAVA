//Write a program that takes a sentence as input from the user and
// performs the following operations:
//Count the number of words in the sentence.
//Reverse the entire sentence.
//Replace all vowels in the sentence with the character '*'.

import java.util.*;

public class StringA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int c=count(input);
        String rev=reverse(input);
        String repVowels=replaceVowels(input);
        System.out.println("count: "+c);
        System.out.println("Reverse: "+rev);
        System.out.println("Replace Vowels: "+repVowels);

    }
    public static int count(String input){
        int cn=0;
        for(int i=0;i<input.length();i++){
            cn++;
        }
        return cn;
    }
    public static String reverse(String input){
        String res="";
        for(int i=0;i<input.length();i++){
            res=input.charAt(i)+res;
        }
        return res;
    }
    public static String replaceVowels(String input){
        String vowels="aeiouAEIOU";
        String[] str=input.split("");
        String res="";
        for(int i=0;i<str.length;i++){
            String ch=String.valueOf(str[i]);
            if(vowels.contains(ch)){
                res=res+"*";
            }
            else{
                res=res+ch;
            }
        }
        return res;
    }
}