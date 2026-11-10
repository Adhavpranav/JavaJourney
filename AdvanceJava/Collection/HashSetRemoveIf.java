package Collection;

import java.util.HashSet;

public class HashSetRemoveIf {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=1;i<=20;i++){
            hashSet.add(i);
        }

        System.out.println("HashSet:"+hashSet);
        hashSet.removeIf(i->i%2==0);
        System.out.println("HashSet:"+hashSet);

        hashSet.removeIf(i->i>15);
        System.out.println("HashSet:"+hashSet);
    }
}
