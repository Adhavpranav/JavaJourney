package CoreJava;

class Bank{
    private Bank(){
        System.out.println("Bank object is Created");
    }
    public static void showBankName(){
        System.out.println("SBI Bank");
        Bank obj=new Bank();//by this u can access private constructor 
    }
}

public class PrivateConstructor {
    public static void main(String[] args) {
        //Bank obj=new Bank(); here it gives error ... bank has private access
        Bank.showBankName();
    }
}
