package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListChallenge3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(40, 10, 30, 20, 10, 50, 30, 60, 20)
        );

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }

        list.sort(Collections.reverseOrder());

        list.replaceAll(n -> n > 30 ? -1 : n);

        System.out.println(list);
    }
}
