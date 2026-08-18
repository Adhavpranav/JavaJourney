package CoreJava;

class Payment{
    protected int amount=500;
    protected void pay(){
        System.out.println("Payment of "+amount);
    }
}

class UPIPayment extends Payment{
    protected void upi(){
        System.out.println("Paid using upi");
    }
}

class CardPayment extends Payment{
    protected void card(){
        System.out.println("Paid using Card");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        UPIPayment upiPayment=new UPIPayment();
        CardPayment cardPayment=new CardPayment();

        upiPayment.pay();
        upiPayment.upi();

        cardPayment.pay();
        cardPayment.card();
    }
}
