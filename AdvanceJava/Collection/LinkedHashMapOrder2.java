package Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapOrder2 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map =
                new LinkedHashMap<>(16, 0.75f, true);

        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Mango");
        map.put(4,"Grapes");

        System.out.println(map.get(2));
        System.out.println(map.get(1));

        map.put(3,"Orange");
        map.put(5,"Kiwi");

         System.out.println(map.get(4));
        System.out.println(map);
    }
}
