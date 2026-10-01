package FileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentInfo implements Serializable {
    String name;
    int age;
    String course;

    public StudentInfo(String name,int age,  String course) {
        this.age = age;
        this.name = name;
        this.course = course;
    }
}

public class StudentSerialization {
    public static void main(String[] args) throws Exception{
        StudentInfo studentInfo=new StudentInfo("Ayushi",21,"Java developer");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("student.ser"));
        objectOutputStream.writeObject(studentInfo);
        objectOutputStream.close();
        System.out.println("Serialized data is saved");
    }
}
