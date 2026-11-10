package Collection;

import java.util.HashSet;
import java.util.Objects;

class StudentInfo{
    private int id;
    private  String name;

    StudentInfo(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public  String toString(){
        return  "id:"+id+" name:"+name;
    }

    @Override
    public  boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        StudentInfo student = (StudentInfo) obj;
        return this.id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class HashSetStudentObjects {
    public static void main(String[] args) {
        HashSet<StudentInfo> hashSet = new HashSet<>();
        hashSet.add(new StudentInfo(1,"Pranav"));
        hashSet.add(new StudentInfo(2,"Ayushi"));
        hashSet.add(new StudentInfo(3,"Misty"));
        hashSet.add(new StudentInfo(4,"Ace"));
        hashSet.add(new StudentInfo(5,"Blaze"));

        System.out.println(hashSet.add(new StudentInfo(2,"Ananya")));//false 
        // cause i override equals and hashcode 
        System.out.println(hashSet.toString());

        for(StudentInfo student:hashSet){
            if(student.getName().equals("Ayushi") || student.getName().equals("Ananya")){
                System.out.println(student.getId());
                System.out.println(student.getName());
                System.out.println(student.hashCode());
            }
        }
    }
}
