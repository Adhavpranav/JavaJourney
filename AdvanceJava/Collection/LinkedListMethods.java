package Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        linkedList.offerFirst(5);
//        linkedList.addFirst(5);
        linkedList.offerLast(60);
//        linkedList.addLast(60);

        linkedList.set(2,25);
        System.out.println("First element: "+linkedList.getFirst());
        System.out.println("Last element: "+linkedList.getLast());

        if(linkedList.contains(40)){
            System.out.println("Element found");
        }
        System.out.println("Last ele removed "+linkedList.removeLast());
//        System.out.println("Last element removed :"+linkedList.pop());
        System.out.println(linkedList);
    }
}
