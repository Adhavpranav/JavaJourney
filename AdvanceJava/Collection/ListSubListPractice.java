package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSubListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        var view = list.subList(2, 5);
        System.out.println(view);
        view.set(0,999);
        System.out.println("Original list :"+list);//[10, 20, 999, 40, 50, 60, 70] original also chnage 
        System.out.println("View :"+view);//[999, 40, 50]
    }
}
