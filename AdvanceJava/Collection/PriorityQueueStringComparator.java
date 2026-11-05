package Collection;

import java.util.*;

public class PriorityQueueStringComparator {
    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(comparator);

        Collections.addAll(priorityQueue,"Java", "AI", "Python", "C", "Spring", "Go");

        System.out.println("Head of queue :"+priorityQueue.peek());

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
