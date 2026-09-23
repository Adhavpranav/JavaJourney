package Generics;

import java.util.ArrayList;

public class UpperBoundedWildcard {
    static void displayNumbers(ArrayList<? extends Number> numbers){
        for (Number number : numbers){
            System.out.println(number);
        }
//        System.out.println(numbers.getFirst());
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        ArrayList<Double> numbers2 = new ArrayList<>();
        numbers2.add(10.0);
        numbers2.add(20.0);

        displayNumbers(numbers);
        displayNumbers(numbers2);


    }
}
