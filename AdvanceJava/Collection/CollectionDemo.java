package Collection;
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Pranav");
        collection.add("Ayushi");
        collection.add("Mistry");

        System.out.println(collection);
        System.out.println("Total name: "+collection.size());
        if(collection.contains("Pranav")){
            System.out.println("Pranav is found");
        }else{
            System.out.println("Pranav is not found");
        }

        collection.remove("Pranav");
        System.out.println(collection);
    }
}
