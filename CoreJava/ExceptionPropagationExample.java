package ExceptionHandling;

public class ExceptionPropagationExample {
    // Exception propagation works through the call stack.
// If the current method doesn't handle the exception,
// it propagates to its caller.
    static void method1(){
        method2();
    }
    static  void method2(){
        method3();
    }
    static  void method3(){
        int ans=10/0;//Exception occurred hre
        System.out.println(ans);// this line never execute 
    }
    public static void main(String[] args) {
        try {
            method1();
        }catch (ArithmeticException arithmeticException){
            System.out.println("Arithmetic Exception occurred");
        }
    }
}
