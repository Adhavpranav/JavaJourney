package Collection;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetHeadTail {
    public static void main(String[] args) {
        SortedSet<Integer>sortedSet = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80));
        System.out.println(sortedSet);

        System.out.println(sortedSet.headSet(50));//here it give ele less than 50
        System.out.println(sortedSet.tailSet(50));// here it give ele which is >=50
        
    }
}
