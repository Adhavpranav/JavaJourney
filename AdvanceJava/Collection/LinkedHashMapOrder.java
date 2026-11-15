package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapOrder {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1,"Apple");
        linkedHashMap.put(2,"Banana");
        linkedHashMap.put(3,"Mango");

        linkedHashMap.put(2,"Orange");
        linkedHashMap.put(4,"Grapes");

        linkedHashMap.remove(1);
        System.out.println(linkedHashMap);
    }
}
