import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.print("Enter the operation(+,-,*,/):");
        char ch=sc.next().charAt(0);
        switch (ch){
            case '+':
                System.out.print(n1+n2);
                break;
            case '-':
                System.out.print(n1-n2);
                break;
            case '*':
                System.out.print(n1*n2);
                break;
            case '/':
                System.out.print(n1/n2);
                break;
            default:
                System.out.print("Invalid Operation");
                break;
        }

    }
}
