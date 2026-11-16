package Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapNavigation {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>(
                Map.of(
                        1,"Pranav",
                        2,"Aayushi",
                        4,"Silvi",
                        5,"Sasha",
                        6,"Serena",
                        3,"Misty"
                ));

        for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Smallest rollNo: "+treeMap.firstEntry());
        System.out.println("Largest rollNo: "+treeMap.lastEntry());

        System.out.println("lower keys:");
        System.out.println(treeMap.lowerKey(5));

        System.out.println("higher keys:");
        System.out.println(treeMap.higherKey(5));

        for(Map.Entry<Integer, String> entry : treeMap.subMap(3,5).entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Map in descending order:");
        for(Map.Entry<Integer, String> entry : treeMap.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap.pollLastEntry());
    }
}
