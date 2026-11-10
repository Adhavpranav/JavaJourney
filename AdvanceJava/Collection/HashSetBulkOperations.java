package Collection;

import java.util.HashSet;

public class HashSetBulkOperations {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1=new HashSet<>();
        HashSet<Integer> hashSet2=new HashSet<>();

        for(int i=0;i<8;i++){
            hashSet1.add(i);
        }

        for(int i=5;i<11;i++){
            hashSet2.add(i);
        }

        System.out.println(hashSet1);
        System.out.println(hashSet2);

        hashSet1.addAll(hashSet2);
        System.out.println(hashSet1);

        hashSet1.removeAll(hashSet2);
        System.out.println(hashSet1);

        System.out.println(hashSet1.containsAll(hashSet2));
    }
}
