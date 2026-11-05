package Collection;

import java.util.*;

public class PriorityQueueMaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        Collections.addAll(priorityQueue, 10, 50, 20, 80, 30);

        System.out.println("Head of queue :"+priorityQueue.peek());

        System.out.println("Removing elements of priority queue: ");
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

    }
}
