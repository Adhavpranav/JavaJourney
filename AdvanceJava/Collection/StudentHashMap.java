package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class StudentDetails{
    private int rollno;
    private String name;

    StudentDetails(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof StudentDetails))
            return false;

        StudentDetails s = (StudentDetails) obj;

        return rollno == s.rollno &&
                name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno, name);
    }
}

public class StudentHashMap {
    public static void main(String[] args) {
        HashMap<StudentDetails,Integer> hashMap = new HashMap<>(
                Map.of(
                    new StudentDetails(101,"Pranav"),80,
                        new StudentDetails(102,"Ayushi"),90,
                    new StudentDetails(101,"Misty"),50
                ));

        for(Map.Entry<StudentDetails, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey().getName()+"-------"+entry.getValue());
        }

        StudentDetails studentDetails = new StudentDetails(101,"Pranav");
        hashMap.put(studentDetails,99);
        System.out.println("-----------------------------------------------");
        for(Map.Entry<StudentDetails, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey().getName()+"-------"+entry.getValue());
        }

    }
}
