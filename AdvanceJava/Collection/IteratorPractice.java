package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> iterator=list.iterator();
        System.out.println("Elements of ArrayList: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
