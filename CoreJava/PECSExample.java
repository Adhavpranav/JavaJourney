package Generics;

import java.util.ArrayList;
import java.util.List;

public class PECSExample{
    static void readNumbers(List<? extends Number> list){
        for(Number number : list){
            System.out.println(number);
        }
    }
    static void addNumbers(List<? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addNumbers(list);
        readNumbers(list);
    }
}
