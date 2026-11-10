package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetRemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,3,4,7,2,3,5,5,6));
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}
