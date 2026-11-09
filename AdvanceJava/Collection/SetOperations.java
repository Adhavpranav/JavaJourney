package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(30, 40, 50, 60, 70));

        Set<Integer> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);

        System.out.println("Union"+result);
        result.clear();
        result.addAll(set1);
        result.retainAll(set2);
        System.out.println("Intersection"+result);

        result.clear();
        result.addAll(set1);
        result.removeAll(set2);
        System.out.println("Difference"+result);


    }
}
