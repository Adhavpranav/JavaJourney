package Generics;
import java.util.*;

public class LowerBoundTest {
    static void addIntegers(List<? super Integer>list){
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
    }

    public static void main(String[] args) {
        //They all add as Integer cause bound is Integer
        List<Integer> list = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addIntegers(list);
        addIntegers(numbers);
        addIntegers(objects);
    }
}
