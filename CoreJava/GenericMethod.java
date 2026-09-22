package Generics;

public class GenericMethod {
    static <T>void display(T value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        display("Pranav");
        display(100);
        display(10.5);
    }
}
