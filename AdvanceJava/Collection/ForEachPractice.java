package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachPractice {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));
        list.forEach((element)->{
            System.out.println((int)Math.pow(element,2));
        });
    }
}
