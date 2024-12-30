import java.util.*;

public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(isprime(n));
    }
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
