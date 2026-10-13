
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        // Adding elements
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");

        // Display collection
        System.out.println("Languages: " + languages);

        // Access an element
        System.out.println("First language: " + languages.get(0));

        // Update an element
        languages.set(1, "C++");

        // Remove an element
        languages.remove("JavaScript");

        // Iterate through collection
        for (String language : languages) {
            System.out.println(language);
        }

        // Check size
        System.out.println("Size: " + languages.size());
    }
}
