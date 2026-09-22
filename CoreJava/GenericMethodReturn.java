package Generics;

public class GenericMethodReturn {
    static <T> T getValue(T value){
        return value;
    }

    public static void main(String[] args) {
        System.out.println(getValue(10));
        System.out.println(getValue("Ayushi"));
        System.out.println(getValue(true));
    }
}
