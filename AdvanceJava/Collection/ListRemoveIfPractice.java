package Collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRemoveIfPractice {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10, 20, 30, 23, 40, 50));
       list.removeIf((num)->{
            if(num%2==0){
                return true;
            }
            return  false;
        });
        System.out.println(list);
    }
}
