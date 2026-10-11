package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFilter {
    public static void main(String[] args) {
        Collection<Integer>collection1=new ArrayList<>();
        collection1.add(10);
        collection1.add(20);
        collection1.add(30);
        collection1.add(40);
        collection1.add(50);

        Collection<Integer> collection2=new ArrayList<>();
        collection2.add(20);
        collection2.add(40);

        System.out.println("Collection One :"+collection1);
        System.out.println("Collection Two :"+collection2);

        collection1.removeAll(collection2);
        System.out.println("Collection One :"+collection1);

        Collection<Integer> collection3=new ArrayList<>();
        collection3.add(10);
        collection3.add(20);
        collection3.add(30);
        collection3.add(40);
        collection3.add(50);

        collection3.retainAll(collection2);
        System.out.println(collection3);
    }
}
