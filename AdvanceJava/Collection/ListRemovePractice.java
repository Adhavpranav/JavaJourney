package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRemovePractice {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10, 20, 30, 20, 40, 50));
        int removedElement=list.remove(2);
        System.out.println(removedElement);
        list.remove(Integer.valueOf(20));
        System.out.println(list);
        System.out.println(list.size());
    }
}
