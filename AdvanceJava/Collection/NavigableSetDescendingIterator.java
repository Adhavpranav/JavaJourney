package Collection;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDescendingIterator {
    public static void main(String[] args) {
        NavigableSet<String> navigableSet = new TreeSet<>(Arrays.asList("Apple", "Banana", "Mango", "Orange", "Grapes"));
        System.out.println(navigableSet);

        Iterator<String> iterator = navigableSet.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
}
