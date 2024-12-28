public class Account {
    String accountNumber;
    double balance;
    Account(){
        this.accountNumber="SBI123456789";
        this.balance=3000.00;
    }
    Account(String accountNumber){
        this.accountNumber=accountNumber;
        this.balance=2000.00;
    }
    Account(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void display() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }
    public static void main(String[] args){
        Account d_account=new Account();
        d_account.display();
        Account p_account=new Account("SBI123444555");
        p_account.display();
        Account account=new Account("SBI123454321",9000.00);
        account.display();


    }
}
