package CoreJava;

class Calculator{
    static int add(int number1,int number2){
        return  number1+number2;
    }

    static int multiply(int number1,int number2){
        return number1*number2;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println(Calculator.add(10,20));
        System.out.println(Calculator.multiply(10,5));
    }
}
