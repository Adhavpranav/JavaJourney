package Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudentAnalyzer {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>(
                Map.of(
                        45, "Rahul",
                        92, "Pranav",
                        68, "Aayushi",
                        75, "Sneha",
                        88, "Karan",
                        55, "Riya",
                        81, "Arjun",
                        96, "Neha",
                        62, "Sasha",
                        73, "Misty"
                )
        );

        for(Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Highest scoring student: "+students.lastKey());
        System.out.println("Lowest scoring student: "+students.firstKey());

        System.out.println(students.lowerEntry(75));
        System.out.println(students.higherEntry(75));

        for(Map.Entry<Integer, String> entry : students.subMap(60,true,90,true).entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Top three students:");

        int counter=0;
        for(Map.Entry<Integer, String> entry : students.descendingMap().entrySet()) {
            if(counter==3)
                break;
            System.out.println(entry.getKey() + " : " + entry.getValue());
            counter++;
        }
    }
}
