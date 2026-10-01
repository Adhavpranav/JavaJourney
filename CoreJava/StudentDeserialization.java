package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserialization {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("student.ser"));
        Object data=objectInputStream.readObject();
        StudentInfo studentInfo=(StudentInfo)data;

        System.out.println("Student name: "+studentInfo.name);
        System.out.println("Student age: "+studentInfo.age);
        System.out.println("Student course: "+studentInfo.course);

        objectInputStream.close();
    }
}
