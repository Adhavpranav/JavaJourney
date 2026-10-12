package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachRemainingPractice {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, 35, 40));
        Iterator<Integer> iterator=list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        iterator.forEachRemaining(System.out::println);
//        System.out.println(iterator.next());NoSuchElementException
    }
}
