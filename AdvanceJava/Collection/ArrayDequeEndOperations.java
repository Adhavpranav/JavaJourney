package Collection;

import java.util.ArrayDeque;

public class ArrayDequeEndOperations {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addLast(20);
        arrayDeque.addLast(30);
        arrayDeque.addLast(40);

        arrayDeque.addFirst(10);

        arrayDeque.offerLast(50);
        arrayDeque.offerFirst(5);

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.removeFirst());
        System.out.println(arrayDeque.pollLast());

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
    }
}
