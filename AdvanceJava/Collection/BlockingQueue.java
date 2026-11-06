package Collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueCompleteDemo {
    public static void main(String[] args) {

        try {
            BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5);

            blockingQueue.put(10);
            blockingQueue.put(20);
            blockingQueue.put(30);

            System.out.println(blockingQueue);

            System.out.println("Head :"+blockingQueue.peek());
            System.out.println(blockingQueue.take());

            System.out.println(blockingQueue);

            blockingQueue.offer(40);
            blockingQueue.offer(50);

            System.out.println(blockingQueue);
            System.out.println(blockingQueue.contains(30));

            System.out.println(blockingQueue.size());

            blockingQueue.offer(60);
            System.out.println(blockingQueue);
//            blockingQueue.add(70); if i used offer/put exception not occures

            System.out.println(blockingQueue.poll());

            System.out.println(blockingQueue);

        }catch (  InterruptedException |Exception  e){
            System.out.println("Exception :"+e.getMessage());
        }
    }
}
