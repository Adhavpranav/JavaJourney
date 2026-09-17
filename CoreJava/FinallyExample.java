package ExceptionHandling;

public class FinallyExample {
    public static void main(String[] args) {
        try{
            int ans=10/0;
            System.out.println("it will never reach");
        }catch (ArithmeticException e){
            System.out.println("Exception handled");
        }finally {
            // it works always ... exclude some conditions
            System.out.println("Finally block executed");
        }
        System.out.println("Program ended");
    }
}
