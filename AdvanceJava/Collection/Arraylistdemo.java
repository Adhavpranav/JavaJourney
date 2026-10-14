import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
       
        List<String> fruits = new ArrayList<>();

       
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Initial List: " + fruits);

  
        String firstFruit = fruits.get(0);
        System.out.println("First element: " + firstFruit);

      
        fruits.set(1, "Blueberry"); 
        System.out.println("After update: " + fruits);

        fruits.remove(2); // Removes "Orange" at index 2
        System.out.println("After removal: " + fruits);

        System.out.println("List size: " + fruits.size());
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));

        System.out.println("--- Iterating over elements ---");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
