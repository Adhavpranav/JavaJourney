package CoreJava;

class StudentDetails{

    String name;
    int age;
    String course;

    StudentDetails(){
        this("Pranav",20,"JavaFullStack");
        System.out.println("This is default constructor");
    }

    StudentDetails(String name,int age,String course){
        this.name=name;
        this.age=age;
        this.course=course;
        System.out.println("This is parameterized constructor");
    }

    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Course:"+course);
        System.out.println();
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        StudentDetails obj=new StudentDetails();
        obj.display();
    }
}
