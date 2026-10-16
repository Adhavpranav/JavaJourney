package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSearchPractice {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(10, 20, 30, 20, 40, 50));
        if(list.contains((30))){
            System.out.println("30 is present in list");
        }
        System.out.println("First index of 20 is :"+list.indexOf(20));
        System.out.println("Last index of 20 is :"+list.lastIndexOf(20));

        if(list.contains(100)){
            System.out.println("100 is present in list at :"+list.indexOf(100));
        }else{
            System.out.println("100 is NOT present in list");
        }
    }
}
