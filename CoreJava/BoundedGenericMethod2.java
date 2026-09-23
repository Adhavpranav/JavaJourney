package Generics;

public class BoundedGenericMethod2 {
    static <T extends Number> double sum(T firstNumber,T secondNumber){
        return firstNumber.doubleValue()+secondNumber.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1.2,3.4));
//        System.out.println(sum("Pranav","Ayushi")); it gives error it required Number values
    }
}
