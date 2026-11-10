package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetShoppingCart {
    public static void main(String[] args) {

        //developing an online shopping application
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("iPhone", "Laptop", "Headphones", "Mouse",
                "Keyboard", "Laptop", "Smartwatch"));
        linkedHashSet.add("Laptop");
        linkedHashSet.remove("Mouse");
        linkedHashSet.add("Tablet");
        linkedHashSet.add("Monitor");

        System.out.println(linkedHashSet.contains("Headphones"));

        Iterator<String> iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(linkedHashSet.size());
    }
}
