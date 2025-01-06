//Given an array of integers, find the largest sum of a contiguous subarray. Implement an efficient algorithm to solve this problem.
//
//Example:
//Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//Output: 6
//Explanation: The subarray [4, -1, 2, 1] has the largest sum = 6.

public class SubArray {
    public static void main(String[] args){
         int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
         int max=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
             int sum=0;
             for(int j=i;j<arr.length;j++){
                 sum=sum+arr[j];
                 if(sum>max){
                     max=sum;
                 }
             }
         }
         System.out.print(max);
    }
}
