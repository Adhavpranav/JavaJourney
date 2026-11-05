package Collection;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueDuplicates {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(10, 20, 10, 30, 20, 10));
        System.out.println("Size :"+priorityQueue.size());

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
        
    }
}
