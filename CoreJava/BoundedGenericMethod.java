package Generics;

public class BoundedGenericMethod {
    static <T extends Number> void display(T value){
        //Here T must be number or subclass of Number
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        display(10);
        display(null);
        display(10.2);
//        display("Pranav"); it will gives error
    }
}
