package Generics;

import java.util.*;

public class WildcardExample {
    static void displayList(ArrayList<?> list) {
//        list.add(10);
//        list.add("Ayushi");
        //here adding not possible we dont know type

        for(Object item:list){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Pranav");
        names.add("Ayushi");

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        //We cannot add a specific value to ArrayList<?> because the actual element type is unknown.

        displayList(names);
        displayList(numbers);
    }
}
