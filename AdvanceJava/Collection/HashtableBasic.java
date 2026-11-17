package Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashtableBasic {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>(Map.of(
                1,"Pranav",
                2,"Aayushi",
                3,"Misty",
                4,"Silvi",
                5,"Serena"

        ));

        System.out.println(hashtable);

        System.out.println(hashtable.get(3));
        System.out.println(hashtable.put(2,"Aysha"));

        hashtable.remove(5);
        System.out.println(hashtable.containsKey(4));
    }
}
