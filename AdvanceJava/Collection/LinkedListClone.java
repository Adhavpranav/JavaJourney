package Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListClone {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(10,20,30));
//        @SuppressWarnings("unchecked")
        LinkedList <Integer> copy = (LinkedList<Integer>) linkedList.clone();

        System.out.println(copy);
        copy.add(100);

        System.out.println(linkedList);
        System.out.println(copy);
    }
}
