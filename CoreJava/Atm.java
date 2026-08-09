package CoreJava;

import java.util.Scanner;

public class Atm {
    private String accountHolder;
    int pin;
    double balance;

    private void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid Deposit Amount");
        }else{
            balance+=amount;
            System.out.println("Deposit Successful");
        }
    }

    void withdraw(int enteredPin, double amount){
        if(pin==enteredPin){
            if(balance>=amount){
                balance=balance-amount;
                System.out.println("Withdrawal Successful");
            }else{
                System.out.println("Insufficient Balance");
            }
        }else{
            System.out.println("Invalid PIN");
        }
    }

    void checkBalance(int enteredPin){
        if(pin==enteredPin){
            System.out.println("Current Balance:"+balance);
        }else{
            System.out.println("Invalid PIN");
        }
    }

    int getPin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter PIN");
        return sc.nextInt();
    }

    void displayAccount(){
        System.out.println("Account Holder:"+accountHolder);
        System.out.println("PIN: ****");
        System.out.println("Balance :"+balance);
    }

    public static void main(String[] args) {

        Atm acc1=new Atm();
        Atm acc2=new Atm();

        acc1.accountHolder="Pranav";
        acc1.pin=1234;
        acc1.balance=2000;

        acc2.accountHolder="Ayushi";
        acc2.pin=1234;
        acc2.balance=3000;

        acc1.deposit(1000);
        acc2.deposit(2000);

        acc1.checkBalance(acc1.getPin());
        acc2.checkBalance(acc2.getPin());

        acc1.withdraw(acc1.getPin(),1000);
        acc2.withdraw(acc2.getPin(),7000);
    }
}
