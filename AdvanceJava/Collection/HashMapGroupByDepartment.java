package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class EmployeeInfo{
    private int id;
    private  String name;
    private String department;
    public EmployeeInfo(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class HashMapGroupByDepartment {
    public static void main(String[] args) {
        ArrayList<EmployeeInfo> employees = new ArrayList<>(Arrays.asList(
                new EmployeeInfo(101, "Pranav", "IT"),
                new EmployeeInfo(102, "Ayushi", "HR"),
                new EmployeeInfo(103, "Misty", "IT"),
                new EmployeeInfo(104, "Rahul", "HR"),
                new EmployeeInfo(105, "Silvi", "Finance"),
                new EmployeeInfo(106, "John", "IT")
        ));

        HashMap<String,ArrayList<EmployeeInfo>> map = new HashMap<>();

        for(EmployeeInfo e: employees){
            ArrayList<EmployeeInfo> list;
            if(!map.containsKey(e.getDepartment())){
                list = new ArrayList<>();
            }else{
                list = map.get(e.getDepartment());
            }
            list.add(e);
            map.put(e.getDepartment(),list);
        }

        for(Map.Entry<String,ArrayList<EmployeeInfo>> entry: map.entrySet()){
            System.out.println(entry.getKey()+"----------------"+entry.getValue().toString());
        }

    }
}
