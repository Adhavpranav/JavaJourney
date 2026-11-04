package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueSearchModify {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        Iterator<Integer> iterator = queue.iterator();

        int index=-1;
        while(iterator.hasNext()){
            index++;
            if(iterator.next() == 40){
                break;
            }
        }

        System.out.println(index);

        queue.removeIf(item->item%2==0);
        System.out.println(queue);

        System.out.println(queue.isEmpty());
    }
}
