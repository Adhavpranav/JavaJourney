package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        Iterator<Integer> iterator = linkedList.iterator();
        ListIterator<Integer> listIterator = linkedList.listIterator();


        System.out.println("Using iterator :");
        while(iterator.hasNext()){
            int currentElement=iterator.next();
            if(currentElement==30){
                linkedList.set(linkedList.indexOf(currentElement),300);
                currentElement=300;
            }
            System.out.println(currentElement);
        }

        System.out.println("Using ListIterator :");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("Using LinkedListIterator :");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
