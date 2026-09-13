package CoreJava;

interface PaymentService{
    default void processPayment() {
        validatePayment();
        System.out.println("Processing Payment");
    }
    private void validatePayment() {
        System.out.println("Payment validated");
    }
}

class OnlinePayment implements  PaymentService{

}

public class InterfacePrivateMethod {
    public static void main(String[] args) {
        OnlinePayment onlinePayment = new OnlinePayment();
        onlinePayment.processPayment();
    }
}
