//For each element in an array, find the next greater element to its right. If no such element exists, return -1 for that number.
//Example:
//Input: nums = [4, 5, 2, 10]
//Output: [5, 10, 10, -1]

import java.lang.reflect.Array;
import java.util.Arrays;

public class NextGreater {
    public static void main(String[] args){
        int[] nums={4, 5, 2, 10};
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                res[i]=-1;
                return;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    res[i]=nums[j];
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(res));
    }
}
