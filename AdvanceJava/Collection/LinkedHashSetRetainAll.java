package Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetRetainAll {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet1=new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        LinkedHashSet<Integer> linkedHashSet2=new LinkedHashSet<>(Arrays.asList(30, 40, 50, 60, 70));

        LinkedHashSet<Integer> linkedHashSet3=new LinkedHashSet<>(linkedHashSet1);
        linkedHashSet3.retainAll(linkedHashSet2);
        System.out.println(linkedHashSet3);

        System.out.println(linkedHashSet1.containsAll(linkedHashSet2));
        System.out.println(linkedHashSet3.size());
    }
}
