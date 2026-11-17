package Collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapPractice1 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> employees =
                new ConcurrentHashMap<>(Map.of(
                        101, "Pranav",
                        102, "Aayushi",
                        103, "Misty",
                        104, "Silvi",
                        105, "Serena"
                ));

        System.out.println(employees);

        System.out.println(employees.get(103));

        employees.put(102,"Obito");
        employees.putIfAbsent(106,"Prisha");

        employees.computeIfPresent(103,(key,value)->value+" (Senior)");

        System.out.println(employees.containsKey(101));
        System.out.println(employees.containsValue("Prisha"));

        employees.remove(105);

        employees.merge(101," - Developer",(oldValue,newValue)->oldValue+newValue);
        System.out.println(employees);

    }
}
