package Collection;

import java.util.LinkedList;

public class LinkedListQueue {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.offer(10);
        linkedList.offer(20);
        linkedList.offer(30);

        System.out.println(linkedList);

        System.out.println(linkedList.peek());//10
        System.out.println(linkedList.poll());//10

        System.out.println(linkedList);//20 30

        LinkedList<Integer> linkedList1 = new LinkedList<>();
//        System.out.println(linkedList1.element());// it will throw exception if list is empty
        System.out.println(linkedList1.peek());//it will return null if list is empty
    }
}
