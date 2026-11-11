package Collection;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetBasic {
    public static void main(String[] args) {
        SortedSet<Integer>sortedSet = new TreeSet<>(Arrays.asList(50, 20, 80, 10, 40, 20));
        System.out.println(sortedSet);

        System.out.println("First element :"+sortedSet.first());
        System.out.println("Last element :"+sortedSet.last());

        System.out.println(sortedSet.contains(40));
        System.out.println(sortedSet.size());
    }
}
