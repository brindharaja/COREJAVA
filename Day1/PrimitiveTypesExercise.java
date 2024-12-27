import java.util.*;
public class PrimitiveTypesExercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n_float=sc.nextFloat();
        double n_double=sc.nextDouble();
        int n_int=sc.nextInt();
        byte n_byte= sc.nextByte();
        short n_short= sc.nextShort();
        long n_long= sc.nextLong();
        boolean n_boolean=sc.nextBoolean();
        char n_char=sc.next().charAt(0);
        System.out.println(n_float+" "+n_double+" "+n_int+" "+n_byte+" "+n_short+" "+n_long+" "+n_boolean+" "+n_char);
        int n_double_int = (int) n_double;
        System.out.println(n_double_int);
        sc.close();

    }
}