package Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentMarksManagement {
    public static void main(String[] args) {
        Map<Integer,Integer> hashMap = new HashMap<>();

        hashMap.put(1,50);
        hashMap.put(2,80);
        hashMap.put(3,30);
        hashMap.put(4,90);
        hashMap.put(5,70);

        System.out.println(hashMap);//{1=50, 2=80, 3=30, 4=90, 5=70}

        System.out.println("Mark of 3rd student "+hashMap.get(3));//30

        hashMap.put(1,99);
        System.out.println(hashMap.containsKey(5));//true
        hashMap.remove(4);
        System.out.println(hashMap);//{1=99, 2=80, 3=30, 5=70}

        System.out.println(hashMap.size());//4
    }
}
