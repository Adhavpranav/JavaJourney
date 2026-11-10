package Collection;

import java.util.HashSet;

public class HashSetBasicOperations {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<10;i++){
            hashSet.add(i);
        }

        //this ele are dup so ignored
        System.out.println(hashSet.add(0));
        System.out.println( hashSet.add(1));
        System.out.println( hashSet.add(2));

        for(Integer i:hashSet){
            System.out.println(i.hashCode());
        }

        System.out.println(hashSet.remove(5));

        System.out.println(hashSet.contains(3));

        System.out.println(hashSet);
        System.out.println(hashSet.size());
    }
}
