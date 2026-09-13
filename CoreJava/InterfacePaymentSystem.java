package CoreJava;

interface PaymentInterface{
    void pay(double amount);
    //methods are implicitly public abstract
}
class UPIPaymentClass implements  PaymentInterface{
    @Override
   public void pay(double amount){// we have to use public here
        System.out.println("Paying Using Upi :"+amount);
    }
}

class CardPaymentClass implements  PaymentInterface{
    @Override
    public void pay(double amount){
        System.out.println("Paying Using Card :"+amount);
    }
}

public class InterfacePaymentSystem {
    public static void main(String[] args) {
        PaymentInterface obj1=new UPIPaymentClass();
        PaymentInterface obj2=new CardPaymentClass();
        double amount=100;
        obj1.pay(amount);
        obj2.pay(amount);
    }
}
