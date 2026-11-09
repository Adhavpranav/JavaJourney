package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDuplicateHandling {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        boolean storedResult=set.add("Java");
        System.out.println(storedResult);//false

        System.out.println(set);

        System.out.println(set.add("java"));//true
        //java stings are case sensitive
        System.out.println(set);
    }
}
