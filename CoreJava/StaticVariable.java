package CoreJava;

class StudentRecords{
    String name;
    static String college="Fergusson College";

    StudentRecords(String name){
        this.name=name;
    }

    void display(){
        System.out.println("Student name: "+name);
        System.out.println("College Name:"+college);
        System.out.println();
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        StudentRecords obj1=new StudentRecords("Ayushi");
        StudentRecords obj2=new StudentRecords("Pranav");

        obj1.display();
        obj2.display();
    }
}
