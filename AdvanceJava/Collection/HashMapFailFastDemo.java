package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapFailFastDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>(Map.of(
                101,"Pranav",
                102,"Aayushi",
                103,"Misty"
        ));

//        try {
//            for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
//                System.out.println(entry.getKey()+"-------"+entry.getValue());
//                hashMap.remove(entry.getKey());
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        Iterator<Map.Entry<Integer,String>> iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey()+"-------"+entry.getValue());
            iterator.remove();
        }

        System.out.println(hashMap);
    }
}
