package Generics;

public class GenericMethodVariable {
    static <T> void display(T value){
        T result=value;
        System.out.println("Value: "+result);
    }

    public static void main(String[] args) {
        display("Pranav");
        display(100);
    }
}
