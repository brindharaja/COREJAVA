import java.util.*;
public class BitwiseOperators {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int ls=n1<<n2;
        int rs=n1>>n2;
        System.out.print(ls+" , "+rs);

    }

}
