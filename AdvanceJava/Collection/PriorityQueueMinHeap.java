package Collection;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueMinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(45, 12, 67, 8, 23, 34));
        System.out.println("Head of priority queue: "+priorityQueue.peek());

        for(int i=0;i<3;i++)
            System.out.println("Removing smallest element using poll :"+priorityQueue.poll());

        System.out.println(priorityQueue);
    }
}
