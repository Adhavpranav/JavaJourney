package Generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundExample {
    static void addNumbers(List<?super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
//        list.add(222.2); error
//        list.add("pranav"); error
        

        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addNumbers(list);
    }
}
