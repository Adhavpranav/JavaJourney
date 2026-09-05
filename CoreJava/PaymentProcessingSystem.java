package CoreJava;

abstract class PaymentDetails{
    protected double amount;

    PaymentDetails(double amount){
        this.amount=amount;
    }

    abstract void processPayment();

    protected void generateReceipt(){
        System.out.println("Receipt generated for amount :"+amount);
    }
}

class CreditCardPayment extends PaymentDetails{

    CreditCardPayment(double amount){
        super(amount);
    }

    protected void processPayment(){
        System.out.println("Processing "+amount +" through Credit Card");
    }
}

class UPIPayments extends PaymentDetails{
    UPIPayments(double amount){
        super(amount);
    }

    protected void processPayment(){
        System.out.println("Processing "+amount +" through UPIPayment");
    }
}

class CashOnDelivery extends PaymentDetails{
    CashOnDelivery(double amount){
        super(amount);
    }

    protected void processPayment(){
        System.out.println("Processing "+amount +" through CashOnDelivery");
    }
}

public class PaymentProcessingSystem {
    public static void main(String[] args) {
        PaymentDetails payment1 = new CreditCardPayment(1500);
        PaymentDetails payment2 = new UPIPayments(800);
        PaymentDetails payment3 = new CashOnDelivery(1200);

        payment1.processPayment();
        payment1.generateReceipt();

        payment2.processPayment();
        payment2.generateReceipt();

        payment3.processPayment();
        payment3.generateReceipt();
    }
}
