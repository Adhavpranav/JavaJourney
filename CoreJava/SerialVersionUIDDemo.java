package FileHandling;
import java.io.*;

class Student implements Serializable{

    private static final long serialVersionUID = 1L;
//    private static final long serialVersionUID = 2L;
    // New field + same serialVersionUID =deserialization can work, and the new field gets its default value
    //if we Changed serialVersionUID then InvalidClassException

    String name;
    int rollNo;
    String Email;

    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
}

public class SerialVersionUIDDemo {
    public static void main(String[] args) throws  IOException,ClassNotFoundException {

//        String name="Pranav";
//        int age=21;
//
//        Student student=new Student(name,age);
//
//        File file=new File("employee.ser");
//        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();
//        System.out.println("Object save in file");

        File file = new File("employee.ser");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Student student = (Student)ois.readObject();
        System.out.println(student.name);
        System.out.println(student.rollNo);
        System.out.println(student.Email);

    }
}
