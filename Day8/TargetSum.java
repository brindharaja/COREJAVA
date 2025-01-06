//Given an array of integers and a target number, return the indices of the two numbers that add up to the target. Assume that there is exactly one solution.
//Example:
//Input: nums = [2, 7, 11, 15], target = 9
//Output: [0, 1]
//Explanation: nums[0] + nums[1] = 2 + 7 = 9.

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
