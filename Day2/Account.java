//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Account {
    String accountNumber;
    double balance;

    Account() {
        this.accountNumber = "SBI123456789";
        this.balance = (double)3000.0F;
    }

    Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = (double)2000.0F;
    }

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    public static void main(String[] args) {
        Account d_account = new Account();
        d_account.display();
        Account p_account = new Account("SBI123444555");
        p_account.display();
        Account account = new Account("SBI123454321", (double)9000.0F);
        account.display();
    }
}
