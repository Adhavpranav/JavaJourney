package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueStudentNames {
    public static void main(String... args) {
        Set<String> studentNames=new HashSet<>(Arrays.asList("Rahul", "Amit", "Priya", "Rahul", "Sneha", "Amit", "Rohit"));
        System.out.println(studentNames);

        System.out.println(studentNames.contains("Priya"));
        System.out.println(studentNames.remove("Amit"));

        System.out.println("Total number of register Students: "+studentNames.size());
        List<String> studentNameList=Arrays.asList(studentNames.toArray(new String[0]));
        System.out.println(studentNameList);
    }
}
