package Collection;

import java.util.ArrayList;

public class ArrayListDefaultConstructor {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<5;i++){
            arrayList.add(i);
        }
        System.out.println("ArrayList :"+arrayList);
        System.out.println("ArrayList Size: "+arrayList.size());
    }
}
