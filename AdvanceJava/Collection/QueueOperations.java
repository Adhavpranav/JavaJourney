package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<5;i++){
            queue.offer(i);
        }

        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(queue.peek());
        System.out.println(queue.contains(3));
        System.out.println(queue);
        System.out.println(queue.size());
    }
}
