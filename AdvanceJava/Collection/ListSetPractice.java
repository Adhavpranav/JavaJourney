package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSetPractice {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println(list);
        int previousElement=list.set(2,99);
        System.out.println(previousElement);
        System.out.println("Updated list :"+list);
    }
}
