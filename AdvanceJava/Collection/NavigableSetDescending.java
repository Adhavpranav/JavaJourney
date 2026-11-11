package Collection;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDescending {
    public static void main(String[] args) {
        NavigableSet<Integer>ns=new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println("Original: "+ns);

        NavigableSet<Integer>view=ns.descendingSet();
        System.out.println("Dec :"+view);

        view.add(70);
        System.out.println(ns);
        System.out.println(view);

        view.remove(30);
        System.out.println(ns);
        System.out.println(view);

    }
}
