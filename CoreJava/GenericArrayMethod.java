package Generics;

public class GenericArrayMethod {
    static <T> void display(T[] arrays){
        for(T item:arrays){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40};
        String[] names = {"Java", "Python", "C++"};
        Double[] marks = {10.5, 20.5, 30.5};
        display(numbers);
        display(marks);
        display(names);
    }
}
