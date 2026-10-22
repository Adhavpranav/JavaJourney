package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCollectionConstructor {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList2);
        arrayList2.add(60);
        System.out.println(arrayList);
        System.out.println(arrayList2);
        //here we add elements in 2nd list but 1st list wont chnage even 2nd list is made from 1st one ....
    }
}
