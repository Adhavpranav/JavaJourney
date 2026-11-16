package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEmployeeFilter {
    public static void main(String[] args) {
        LinkedHashMap<Integer,EmployeeDetails>linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(1,new EmployeeDetails(101,"Pranav",17000));
        linkedHashMap.put(2,new EmployeeDetails(102,"Aayushi",48000));
        linkedHashMap.put(3,new EmployeeDetails(103,"Misty",6000));
        linkedHashMap.put(4,new EmployeeDetails(104,"Sasha",19000));

        linkedHashMap.entrySet().removeIf(entry -> entry.getValue().getSalary()<10000);
        for(Map.Entry<Integer, EmployeeDetails> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+"---------------"+entry.getValue().getName());
        }

        System.out.println(linkedHashMap.size());
    }
}
