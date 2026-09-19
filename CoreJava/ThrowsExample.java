package ExceptionHandling;

public class ThrowsExample {
    static void checkNumber(int num)  throws IllegalArgumentException{
        //No need to write throws IllegalArgumentException here cause its uncheck exception
        //throw actually throws the exception
        if(num<0){
            throw new IllegalArgumentException("Number cannot be negative");
            //throw actually create and throw exception
        }else{
            System.out.println("Number is positive");
        }
    }

    public static void main(String[] args) {
        try{
            ThrowsExample.checkNumber(1);
            ThrowsExample.checkNumber(-2);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
