package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee{
    private int id;
    private String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class HashMapCollisionDemo {
    public static void main(String[] args) {
        HashMap<Employee,String> hashMap = new HashMap<>(Map.of(
                new Employee(101,"Pranav"), "Java Developer",
                new Employee(102,"Ayushi"), "Python Developer",
                new Employee(103,"Misty"), "CPP Developer",
                new Employee(104,"Silvi"), "Frontend Developer"
        ));


        System.out.println(hashMap.toString());

        hashMap.put(new Employee(101,"Rudious"), "Go Developer");

        System.out.println(hashMap.size());

        for(Map.Entry<Employee,String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey().getName()+"-------"+entry.getValue());
        }
    }
}
