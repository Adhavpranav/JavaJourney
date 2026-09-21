package ExceptionHandling;

public class methodsOfException {
    public static void main(String[] args) {
        try{
            int result=10/0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());// it will show the exception msg / by zero
            System.out.println(e.toString());//java.lang.ArithmeticException: / by zero it will show exception name and its msg
           e.printStackTrace();//Full error details + location
        }
    }
}
