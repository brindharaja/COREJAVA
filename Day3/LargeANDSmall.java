public class LargeANDSmall {
    public static void main(String[] args){
        int[] arr={2,6,7,23,46,8,9};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("Min Value: "+min+"\n"+"Max Value: "+max);

    }
}
