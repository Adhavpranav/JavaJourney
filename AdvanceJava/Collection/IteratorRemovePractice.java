package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorRemovePractice {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, 35, 40));
        Iterator<Integer> iterator=list.iterator();
        System.out.println("Original list :"+list);
        while(iterator.hasNext()){
            if(iterator.next()%2==0){
                iterator.remove();
            }
        }
        System.out.println("After removing elements from list :"+list);
    }
}
