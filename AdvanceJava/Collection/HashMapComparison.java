package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapComparison {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "Pranav");
        map1.put(102, "Ayushi");
        map1.put(103, "Misty");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(101, "Pranav");
        map2.put(102, "Rahul");
        map2.put(104, "Silvi");

        for(Map.Entry<Integer, String> entry : map1.entrySet()){
            if (map2.containsKey(entry.getKey()) &&
                    entry.getValue().equals(map2.get(entry.getKey()))) {
                System.out.println("Common: " + entry);
            }
        }

        System.out.println("Find keys present in map1 but not in map2");
        for(Integer key:map1.keySet()){
            if(!map2.containsKey(key)){
                System.out.println(key);
            }
        }

        System.out.println("Find keys present in map2 but not in map1");
        for(Integer key:map2.keySet()){
            if(!map1.containsKey(key)){
                System.out.println(key);
            }
        }

        System.out.println("Find keys present in both maps but having different values.");
        for(Integer key:map1.keySet()){
            if(map2.containsKey(key)){
                if(!map2.get(key).equals(map1.get(key))){
                    System.out.println(key);
                }
            }
        }
    }
}
