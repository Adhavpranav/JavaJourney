package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(1, "Pranav");
        employees.put(2, "Ayushi");
        employees.put(3, "Misty");
        employees.put(4, "Shravani");
        employees.put(5, "Dyanu");

        System.out.println("Keys:");
        for(Integer key : employees.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values:");
        for(String value : employees.values()) {
            System.out.println(value);
        }

        System.out.println("Key - Values :");
        for(Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Key - Values ForEach :");
        employees.forEach((key,value)->{
            System.out.println(key + ": " + value);
        });
    }
}
