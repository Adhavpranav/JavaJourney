package Collection;
import  java.util.*;

public class TreeSetRevision {
    public static void main(String[] args) {
        // 1. Natural Ordering
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10); // Duplicate

        System.out.println("Natural Order: " + numbers);

        // 2. Custom Ordering
        TreeSet<Integer> reverse =
                new TreeSet<>(Comparator.reverseOrder());

        reverse.addAll(numbers);

        System.out.println("Reverse Order: " + reverse);

        // 3. Navigation Methods
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
        System.out.println("Lower than 30: " + numbers.lower(30));
        System.out.println("Ceiling of 25: " + numbers.ceiling(25));

        // 4. Null Handling
        try {
            numbers.add(null);
        } catch (NullPointerException e) {
            System.out.println("Null is not allowed!");
        }
    }
}
