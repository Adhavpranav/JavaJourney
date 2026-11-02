package Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListStack {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(10);
        linkedList.push(20);
        linkedList.push(30);

        System.out.println(linkedList);

        System.out.println(linkedList.peek());
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
    }
}
