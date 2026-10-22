package Collection;

import java.util.ArrayList;

public class FailFastEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        for (Integer num : list) {
            System.out.println(num);

//            if (num == 20) {
//                list.add(40); // Structural modification
            //ConcurrentModificationException 
//            }
        }
    }
}
