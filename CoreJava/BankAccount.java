package CoreJava;

public class BankAccount {
    private String accountHolder;
    private double balance;

     private void deposit(double amount){
         if(balance<=0){
             System.out.println("Invalid amount");
             return;
         }
        balance+=amount;
        System.out.println("Amount added \nTotal amount:"+balance);
    }
    private void withdraw(double amount){
        if(balance>=amount){
            double withdrawalAmount=balance-amount;
            balance=balance-amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    void display(){
        System.out.println("Account holder name:"+accountHolder);
        System.out.println("Balance:"+balance);
    }

    public static void main(String[] args) {
        BankAccount acc1=new BankAccount();
        BankAccount acc2=new BankAccount();

        acc1.accountHolder = "Pranav";
        acc1.balance = 5000;

        acc2.accountHolder = "Ayushi";
        acc2.balance = 3000;

        acc1.deposit(2000);
        acc1.withdraw(1200);

        acc2.deposit(500);
        acc2.withdraw(7000);

        acc1.display();
        acc2.display();
    }
}
