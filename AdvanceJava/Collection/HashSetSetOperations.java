package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetSetOperations {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1=new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer> hashSet2=new HashSet<>(Arrays.asList(3,4,5,6));

        System.out.println(hashSet1);
        System.out.println(hashSet2);

        HashSet<Integer> result=new HashSet<>();

        result.addAll(hashSet1);
        result.retainAll(hashSet2);
        System.out.println("Intersection :"+result);
        result.clear();

        result.addAll(hashSet1);
        result.addAll(hashSet2);
        System.out.println("Union :"+result);
        result.clear();

        result.addAll(hashSet1);
        result.removeAll(hashSet2);
        System.out.println("Difference:"+result);
    }
}
