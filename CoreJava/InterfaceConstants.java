package CoreJava;

interface BankInterface{
    double interestRate=7;
    // interface var are public static final implicitly
}

class Customer implements  BankInterface{
    void display(){
        System.out.println("Interest Rate :"+interestRate);
    }
}
public class InterfaceConstants {
    public static void main(String[] args) {
        Customer bank = new Customer();
        
        bank.display();
        System.out.println(Customer.interestRate);
    }
}
