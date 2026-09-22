package Generics;

import java.util.*;

public class GenericsBasics {
    public static void main(String[] args) {

        //Without generics
        ArrayList list=new ArrayList();
        //Here ArrayList doesn't specify a type
        list.add("Pranav");
        list.add(10);//Here we lose type safety
        System.out.println(list);

        //With generics
        ArrayList<String> list2=new ArrayList<>();
        list2.add("Pranav");
//        list2.add(10); it gives error cause it req String
        System.out.println(list2);
    }
}
