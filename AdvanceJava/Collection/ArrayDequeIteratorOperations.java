package Collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeIteratorOperations {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("Java");
        arrayDeque.add("Python");
        arrayDeque.add("JavaScript");
        arrayDeque.add("C++");

        Iterator<String> iterator = arrayDeque.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator=arrayDeque.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        arrayDeque.removeIf(lang->lang.length()<5);

        System.out.println(arrayDeque.contains("Python"));

        System.out.println(arrayDeque);

        String[] arr=arrayDeque.toArray(new String[0]);

        for(String s:arr){
            System.out.println(s);
        }

        System.out.println(arrayDeque.size());
        System.out.println(arrayDeque.isEmpty());
    }
}
