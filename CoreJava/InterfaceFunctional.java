    package CoreJava;

    @FunctionalInterface
    // It just contains one abstract method
    interface CalculatorFunInterface{
        int calculate(int a, int b);
        //It can still have default, static, and private methods
        //Because only calculate() is abstract
    }

//    class CalculatorTest implements  CalculatorFunInterface{
//        @Override
//        public int calculate(int a, int b) {
//            return  a+b;
//        }
//    }

    public class InterfaceFunctional {
        public static void main(String[] args) {
//            CalculatorFunInterface calculator = new CalculatorTest();
//            System.out.println(calculator.calculate(10, 20));

//            CalculatorFunInterface calculator = Integer::sum; we also use this
            CalculatorFunInterface calculator = (a, b) -> a + b; // lamda
            System.out.println(calculator.calculate(10, 20));
        }
    }
