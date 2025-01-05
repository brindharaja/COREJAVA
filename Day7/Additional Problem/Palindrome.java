//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//
//Example 1:
//Input: s = "aba"
//Output: true

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(PalindromeCheck(s1));
    }
    public static boolean PalindromeCheck(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            }else{
                return isPalindrome(s.substring(i+1,j+1)) || isPalindrome(s.substring(i,j));
            }
        }
        return true;
    }
    public static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
