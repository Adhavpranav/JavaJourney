package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListChallenge1 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20, 40, 50, 30, 60));

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }
}
