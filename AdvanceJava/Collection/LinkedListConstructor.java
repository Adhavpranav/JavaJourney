package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListConstructor {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Java","Python", "C","C++","PHP"));
        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        System.out.println("Array list: "+arrayList);
        System.out.println("LinkedList list: "+linkedList);
        linkedList.add("JavaScript");
        //it will not affect Arraylist
        System.out.println("Array list: "+arrayList);
        System.out.println("LinkedList list: "+linkedList);
    }
}
