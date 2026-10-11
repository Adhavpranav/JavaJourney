package Collection;
import java.util.*;

public class CollectionSearch {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();

        collection.add(10);
        collection.add(20);
        collection.add(30);
        collection.add(40);
        collection.add(50);

        if(collection.contains(20)){
            System.out.println("Number found");
        }else{
            System.out.println("Number not found");
        }

        collection.remove(20);

        System.out.println(collection+" Size"+collection.size());

        System.out.println(collection.isEmpty());

    }
}
