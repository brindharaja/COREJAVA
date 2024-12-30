import java.util.*;
public class count1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String binary_n=Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<binary_n.length();i++){
            if(binary_n.charAt(i)=='1'){
                c++;
            }
        }
        System.out.print(c);
    }
}
