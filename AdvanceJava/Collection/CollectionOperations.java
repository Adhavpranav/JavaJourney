package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionOperations {
    public static void main(String[] args) {

        Collection<String> collection1 = new ArrayList<>();
        Collection<String> collection2 = new ArrayList<>();

        collection1.add("Java");
        collection1.add("Python");
        collection1.add("C++");

        collection2.add("JavaScript");
        collection2.add("Python");

        collection1.addAll(collection2);
        System.out.println(collection1);

        System.out.println(collection1.contains("Python"));
        collection1.clear();
        System.out.println(collection1.isEmpty());
    }
}
