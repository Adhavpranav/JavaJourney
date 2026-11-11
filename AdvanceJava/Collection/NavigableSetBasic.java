package Collection;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetBasic {
    public static void main(String[] args) {
        NavigableSet<Integer> ns = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(ns);

        System.out.println(ns.lower(30));
        System.out.println(ns.floor(30));
        System.out.println(ns.ceiling(35));
        System.out.println(ns.higher(30));
        System.out.println(ns.higher(60));
    }
}
