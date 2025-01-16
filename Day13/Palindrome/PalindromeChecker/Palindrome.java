package PalindromeChecker;

public class Palindrome {
    public static boolean isPalindrome(String str1){
        int i=0;
        int j=str1.length()-1;
        while(i<j){
            if(str1.charAt(i)== str1.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Hello"));
        System.out.println(isPalindrome("MalayalaM"));
        System.out.println(isPalindrome("madaM"));
        System.out.println(isPalindrome("String"));
    }
}
