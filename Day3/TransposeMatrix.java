public class TransposeMatrix {
    public static void main(String[] args){
        int[][] arr={{1,1,1},{2,2,2},{3,3,3}};
        int[][] res=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                res[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=res[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
