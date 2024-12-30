public class SumArrayElement {
    public static void main(String[] args){
        int[] arr={2,6,7,23,46,8,9};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("Sum: "+sum);

    }
}
