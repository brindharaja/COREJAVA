public class AddTwoDMatrix {
    public static void main(String[] args){
        int[][] arr1={{1,1,1},{1,1,1},{1,1,1}};
        int[][] arr2={{1,1,1},{1,1,1},{1,1,1}};
        int[][] res=new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                res[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
