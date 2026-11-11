package Collection;

import java.util.*;

public class SortedSetComparator {
    public static void main(String[] args) {
        SortedSet<String>sortedSet = new TreeSet<>(Comparator.reverseOrder());
        Collections.addAll(sortedSet,"Java", "Python", "C++", "JavaScript", "Go");
        System.out.println(sortedSet);

        System.out.println("First Element :"+sortedSet.first());
        System.out.println("Last Element :"+sortedSet.last());

        System.out.println(sortedSet.comparator());

    }
}
