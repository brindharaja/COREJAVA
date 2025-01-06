//Write a function to rotate an array of n integers to the right by k steps.
//
//
//Example:
//Input: nums = [1, 2, 3, 4, 5, 6, 7], k = 3
//Output: [5, 6, 7, 1, 2, 3, 4]
//Explanation: Rotate the array to the right by 3 steps.

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] nums={1,2,3,4,5,6,7};
        int k=sc.nextInt();
        k=k%nums.length;
        int[] res=new int[nums.length];
        for(int i=0;i<k;i++){
            res[i]=nums[nums.length-k+i];
        }
        for(int i=k;i<nums.length;i++){
            res[i]=nums[i-k];
        }
        System.out.print(Arrays.toString(res));
    }
}
