package Collection;

import java.util.ArrayDeque;

public class ArrayDequeAsQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i=1;i<=4;i++){
            deque.offer(i*10);
        }

        System.out.println(deque);

        System.out.println("Head :"+deque.peek());

        System.out.println("Head :"+deque.poll());
        System.out.println("Head :"+deque.poll());

        System.out.println(deque);

        deque.add(500);
        System.out.println(deque);

        System.out.println(deque.size());
    }
}
