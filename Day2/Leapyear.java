import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0){
            System.out.print(true);
        }else if(year%4==0){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}
