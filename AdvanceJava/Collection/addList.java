package Collection;

import java.util.ArrayList;
import java.util.List;

public class addList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
//        list.add(2,20); it gives indexOutOfBounds cause we are skipping index
        list.add(10);//duplicates are allowed
        list.add(2,20);// it works cause previous space is not empty
        System.out.println(list);
        list.add(0,30);
        System.out.println(list);//shifts the existing elements to the right from that index

    }
}
