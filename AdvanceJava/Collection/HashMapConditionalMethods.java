package Collection;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class HashMapConditionalMethods {
    public static void main(String[] args) {
        HashMap<Integer,Integer> students=new HashMap<>(Map.of(
                101,77,
                102,70,
                103,66,
                104,50,
                105,57
        ));

        System.out.println(students);
        students.putIfAbsent(106,85);
        System.out.println(students.getOrDefault(110,0));//0
        students.replace(101,95);
        students.replace(102,70,80);
        System.out.println(students);

        students.computeIfPresent(103,(key,value)->5+value);
        System.out.println(students);

        students.computeIfAbsent(110,k->60);
        System.out.println(students);

        students.merge(104,10,Integer::sum);
        System.out.println(students);

    }
}
