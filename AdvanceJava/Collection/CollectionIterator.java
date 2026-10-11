package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("Python");
        collection.add("Java");
        collection.add("JavaScript");
        collection.add("Sql");

        Iterator<String>iterator=collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
