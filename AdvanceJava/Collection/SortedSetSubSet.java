package Collection;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetSubSet {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>(Arrays.asList( 50, 60, 70, 80,10, 20, 30, 40));
        System.out.println(sortedSet);

        System.out.println(sortedSet.subSet(20, 60));// last one is excluded
        System.out.println(sortedSet.subSet(30, 70));
    }
}
