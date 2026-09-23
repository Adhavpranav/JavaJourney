package Generics;

public class GenericCompareMethod {
    static <T> void compare(T valueOne,T valueSecond){
        if(valueOne.equals(valueSecond)){
            System.out.println("Values are equal");
        }else {
            System.out.println("Values are not equal");
        }
    }

    public static void main(String[] args) {
        compare(10,20);
        compare("Pranav","Ayushi");
        compare("Pranav","Pranav");
    }
}
