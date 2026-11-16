package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

class EmployeeDetails{
    private int id;
    private String name;
    private double salary;

    public EmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id+" "+name + " " + salary;
    }
}

public class LinkedHashMapCustomObjects {
    public static void main(String[] args) {
        LinkedHashMap<Integer, EmployeeDetails> employeeDetails = new LinkedHashMap<>();
        employeeDetails.put(1,new EmployeeDetails(101,"Pranav",7000));
        employeeDetails.put(2,new EmployeeDetails(102,"Aayushi",8000));
        employeeDetails.put(3,new EmployeeDetails(103,"Misty",6000));
        employeeDetails.put(4,new EmployeeDetails(104,"Sasha",9000));

       for(Map.Entry<Integer, EmployeeDetails> entry : employeeDetails.entrySet()){
           System.out.println(entry.getKey()+"---------------"+entry.getValue().getName());
       }

       employeeDetails.put(1,new EmployeeDetails(101,"Pranav",10000));
       employeeDetails.remove(3);

        for(Map.Entry<Integer, EmployeeDetails> entry : employeeDetails.entrySet()){
            System.out.println(entry.getKey()+"---------------"+entry.getValue());
        }
    }
}
