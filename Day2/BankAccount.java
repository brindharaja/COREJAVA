import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public double deposit(double D_amount){
        balance+=D_amount;
        return balance;
    }

    public double withdraw(double W_amount){
        balance-=W_amount;
        return balance;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount bankaccount=new BankAccount("SBI12345678",3000.00);
        System.out.println("1.Deposit\n2.Withdraw\nEnter option:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the amount:");
                double D_amount=sc.nextDouble();
                bankaccount.deposit(D_amount);
                break;
            case 2:
                System.out.println("Enter the amount:");
                double W_amount=sc.nextDouble();
                bankaccount.withdraw(W_amount);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        System.out.println("Balance:"+bankaccount.getBalance());

    }

}
