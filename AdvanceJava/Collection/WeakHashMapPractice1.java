package Collection;

import java.util.WeakHashMap;

public class WeakHashMapPractice1 {
    public static void main(String[] args) {
        WeakHashMap<Object, String> map = new WeakHashMap<>();

        Object key1 = new Object();
        Object key2 = new Object();

        map.put(key1, "Java");
        map.put(key2, "Python");

        System.out.println(map);

        key1 = null;

        System.gc();

        System.out.println(map);
    }
}
