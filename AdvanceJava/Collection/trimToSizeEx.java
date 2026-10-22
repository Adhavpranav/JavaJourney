package Collection;

import java.util.ArrayList;

public class trimToSizeEx {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(20);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.trimToSize();
        System.out.println(arrayList);
    }
}
