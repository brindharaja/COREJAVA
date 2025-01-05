//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]

import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print("["+i+","+j+"]");
                    return;
                }
            }
        }
    }
}
