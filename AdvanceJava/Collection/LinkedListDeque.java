package Collection;

import java.util.LinkedList;

public class LinkedListDeque {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList = new LinkedList<>();

        linkedList.addFirst(10);//10
        linkedList.addLast(20);//10 20

        linkedList.offerFirst(5);//5 10 20
        linkedList.offerLast(30);//5 10 20 30

        System.out.println(linkedList.removeFirst());//5
        System.out.println( linkedList.removeLast());//30

        System.out.println(linkedList);//10 20
    }
}
