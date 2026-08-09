package CoreJava;

public class Student {
    String name;
    int rollno;
    float percentage;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollno);
        System.out.println("Percentage: "+percentage);
    }

    public static void main(String[] args) {
        Student obj1=new Student();
        Student obj2=new Student();
        Student obj3=new Student();

        obj1.name="Pranav";
        obj1.rollno=1;
        obj1.percentage=55;

        obj2.name="Ayushi";
        obj2.rollno=2;
        obj2.percentage=75;

        obj3.name="Aisha";
        obj3.rollno=3;
        obj3.percentage=90;

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
