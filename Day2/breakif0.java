import java.util.*;
public class breakif0 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            int num=sc.nextInt();
            if(num==0){
                System.out.print("break...");
                break;
            }
            i++;
        }

    }
}
