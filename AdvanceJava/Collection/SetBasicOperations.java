package Collection;

import java.util.*;

public class SetBasicOperations {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
     
        System.out.println(Collections.addAll(set,10, 20, 30, 40));//true
        System.out.println(set.add(20));//false
        System.out.println(  set.add(10));//false
        System.out.println(set.add(50));//true


        for(Integer i:set){
            System.out.println(i);
        }

        System.out.println(set.size());

        System.out.println(set.contains(30));

        System.out.println(set.remove(40));
        System.out.println(set);
    }
}
