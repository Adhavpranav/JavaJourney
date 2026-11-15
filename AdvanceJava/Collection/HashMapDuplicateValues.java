package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapDuplicateValues {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Pranav");
        employees.put(102, "Ayushi");
        employees.put(103, "Pranav");
        employees.put(104, "Misty");
        employees.put(105, "Ayushi");
        employees.put(106, "Rahul");
        employees.put(107, "Pranav");

        Map<String, ArrayList<Integer>> hashMap=new HashMap<>();

        for(Map.Entry<Integer, String> entry:employees.entrySet()){
            ArrayList<Integer> list;
            if(hashMap.containsKey(entry.getValue())){
                list=hashMap.get(entry.getValue());
            }else{
                list=new ArrayList<>();
            }
            list.add(entry.getKey());
            hashMap.put(entry.getValue(), list);
        }

        for(Map.Entry<String,ArrayList<Integer>> entry:hashMap.entrySet()){
            if(entry.getValue().size()>1){
                System.out.println(entry.getKey()+"--->"+"Count: "+entry.getValue().size()+"Ids :"+entry.getValue());
            }
        }


    }
}
