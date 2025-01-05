//Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
//A substring is a contiguous sequence of characters within a string.
//
//Example 1:
//Input: patterns = ["a","abc","bc","d"], word = "abc"
//Output: 3

import java.util.Scanner;

public class PatternString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        sc.nextLine();
        String[] pattern=new String[length];
        String word=sc.nextLine();
        int c=0;
        for(int i=0;i<length;i++){
            pattern[i]=sc.nextLine();
            if(word.contains(pattern[i])){
                c++;
            }
        }
        System.out.print(c);
    }
}
