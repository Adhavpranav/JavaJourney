package Collection;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetPoll {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>(Arrays.asList(15, 25, 35, 45, 55, 65));
        System.out.println(navigableSet);

        System.out.println(navigableSet.pollFirst());
        System.out.println(navigableSet);
        System.out.println(navigableSet.pollLast());
        System.out.println(navigableSet);
    }
}
