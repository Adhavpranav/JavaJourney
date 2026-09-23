package Generics;

public class GenericSwapMethod {
    static <T>void  swap(T firstValue,T secondValue){
        T temp=firstValue;
        firstValue=secondValue;
        secondValue=temp;
        System.out.println("First Value: "+firstValue);
        System.out.println("Second Value: "+secondValue);
    }

    public static void main(String[] args) {
        swap("Pranav","Ayushi");
    }
}
