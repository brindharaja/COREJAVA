import java.util.Scanner;

public class BankingSystem {
    String accountNumber;
    double balance;

    BankingSystem(String accountNumber,double balance){
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
        BankingSystem bankingSystem=new BankingSystem("SBI12345678",3000.00);
        char ch;
        do{
            System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\nEnter option:");
            int choice=sc.nextInt();
            if(choice==1) {
                System.out.println("Enter the amount:");
                double D_amount = sc.nextDouble();
                bankingSystem.deposit(D_amount);
            }
            else if(choice==2) {
                System.out.println("Enter the amount:");
                double W_amount = sc.nextDouble();
                bankingSystem.withdraw(W_amount);
            }
            else if(choice==3) {
                System.out.println("Balance : " + bankingSystem.getBalance());
            }
            else {
                System.out.println("Invalid option");
            }
            System.out.println("Do You Want to Continue (y/n): ");
            ch=sc.next().charAt(0);
        }while(ch=='y');
    }
}
