package Generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundReadWrite {
    static void process(List<? super Integer> list){
        list.add(100);
        list.add(200);
//        Integer value= list.getFirst();// it req Integer but we have ? super Integer
        //Java doesn't know the actual type of the list.

//        Integer value=(Integer) list.getFirst(); may we get ClassCastException

        Object value = list.getFirst();// it works cause the safest type Java can guarantee is Objec

        System.out.println(value);
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        process(list);
    }
}
