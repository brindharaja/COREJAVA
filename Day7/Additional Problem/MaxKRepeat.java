//For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.
//Given strings sequence and word, return the maximum k-repeating value of word in sequence.
//
//Example 1:
//Input: sequence = "ababc", word = "ab"
//Output: 2

import java.util.Scanner;

public class MaxKRepeat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String word=sc.nextLine();
        int k=0;
        String res=word;
        while(input.contains(res)){
            k++;
            res=res+word;
        }
        System.out.print(k);
    }
}
