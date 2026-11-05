package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeBasicOperations {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0;i<5;i++)
            deque.addLast(i);

        deque.addFirst(5);
        deque.addLast(6);

//        deque.add(null);

        System.out.println(deque);

        System.out.println("First element :"+deque.getFirst());
        System.out.println("Last element :"+deque.getLast());

        System.out.println("Removed first element: "+deque.removeFirst());
        System.out.println("Removed last element: "+deque.removeLast());

        System.out.println(deque);
    }
}
