//Given an array containing n distinct numbers in the range [0, n], find the one number that is missing from the array.
//Example:
//Input: nums = [3, 0, 1]
//Output: 2

import java.util.Arrays;
import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args){
        int[] nums={3,0,1};
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                System.out.print(nums[i]+1);
            }
        }
    }
}
