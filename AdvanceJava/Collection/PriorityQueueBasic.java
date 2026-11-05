package Collection;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueBasic {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(15, 5, 30, 10, 20));
        System.out.println("Head of list :"+priorityQueue.peek());
        System.out.println("Removing head of list :"+priorityQueue.poll());

        System.out.println(priorityQueue.contains(30));
        System.out.println(priorityQueue);
    }
}
