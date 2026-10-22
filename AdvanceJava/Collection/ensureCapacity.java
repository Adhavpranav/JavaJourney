package Collection;

import java.util.ArrayList;

public class ensureCapacity {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(2);
        //it will create arrayList of 2 elements
        arrayList.add(1);
        arrayList.add(2);
        arrayList.ensureCapacity(10);
        //Ensures capacity for at least 10 elements.
        System.out.println(arrayList);
    }
}
