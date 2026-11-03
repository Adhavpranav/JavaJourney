package Collection;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Vector;

public class VectorListIteratorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(10, 20, 30, 40, 50));
        ListIterator<Integer> listIterator = vector.listIterator();

        System.out.print("Traverse forward :");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next()+"\t");
        }

        listIterator = vector.listIterator();
        while(listIterator.hasNext()){
            if(listIterator.next()==30){
                listIterator.set(300);
                listIterator.add(35);
            }
        }

        System.out.println("Traverse backward :");
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+"\t");
        }

        System.out.println(vector);
    }
}
