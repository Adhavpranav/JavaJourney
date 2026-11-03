package Collection;

import java.util.Vector;

public class VectorCapacityDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(5,3);
        for(int i=0;i<5;i++){
            vector.add(i);
        }

        System.out.println(vector);
        System.out.println("Vector size :"+vector.size());
        System.out.println("Vector capacity :"+vector.capacity());

        vector.add(5);
        System.out.println(vector);
        System.out.println("Vector size :"+vector.size());
        System.out.println("Vector capacity :"+vector.capacity());
    }
}
