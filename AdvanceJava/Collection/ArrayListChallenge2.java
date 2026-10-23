package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListChallenge2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(5, 12, 7, 18, 3, 20, 9, 24, 15, 30));
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            int currentItem=iterator.next();
            if(currentItem%3==0 && currentItem%5==0){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
