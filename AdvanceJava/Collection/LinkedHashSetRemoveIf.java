package Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetRemoveIf {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45));
        set.removeIf(x -> x % 2 == 0);
        System.out.println(set);

        set.add(50);
        set.add(55);

        set.remove(35);

        System.out.println(set);
    }
}
