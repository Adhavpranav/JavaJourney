package Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorIteratorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        for(int i=1;i<=10;i++){
            vector.add(i);
        }

        Iterator<Integer> iterator = vector.iterator();

        System.out.println(vector);

        while(iterator.hasNext()){
            if(iterator.next()%2!=0){
                iterator.remove();
            }
        }

        System.out.println(vector);

    }
}
