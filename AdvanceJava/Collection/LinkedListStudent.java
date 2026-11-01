package Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListStudent {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>(Arrays.asList("Ayushi","Pranav","Mayur","Siya","Tanu"));
        linkedList.remove("Mayur");
        linkedList.addFirst("Pranav");
        for(String names:linkedList){
            System.out.println(names);
        }
        System.out.println("Total no of students: "+linkedList.size());
    }
}
