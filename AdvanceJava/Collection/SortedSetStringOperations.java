package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetStringOperations {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>(Arrays.asList("Apple","Mango","Banana", "Orange", "Grapes", "Pineapple"));
        System.out.println(sortedSet);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());

        System.out.println(sortedSet.headSet("Mango"));
        System.out.println(sortedSet.tailSet("Mango"));

        System.out.println(sortedSet.subSet("Banana","Orange"));
        System.out.println(sortedSet.contains("Grapes"));
    }
}
