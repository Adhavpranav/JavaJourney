package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterationAndRemoval {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45));

        for (Integer integer : set) {
            System.out.println(integer);
        }

        System.out.println(set.contains(40));

        set.removeIf(x->x>30);
        System.out.println(set);

        System.out.println(set.size());
    }
}
