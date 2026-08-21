package CoreJava;

class CalculatorDetails{
    protected int multiply(int num1,int num2){
        return num1*num2;
    }
    protected int multiply(int num1,int num2,int num3){
        return num1*num2*num3;
    }
    protected double multiply(double num1,double num2){
        return num1*num2;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        CalculatorDetails calculatorDetails =new CalculatorDetails();
        System.out.println(calculatorDetails.multiply(10,3));
        System.out.println(calculatorDetails.multiply(10,3,8));
        System.out.println(calculatorDetails.multiply(10.5,4.3));
    }
}
