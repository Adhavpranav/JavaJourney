package CoreJava;

class student{
    String name;
    int age;
    String course;

    student(String name,int age,String course){
        this.name=name;
        this.age=age;
        this.course=course;
    }

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Course:"+course);
    }

}

public class ConstructorBasics {
    public static void main(String[] args) {
        String name="Ayushi";
        int age=20;
        String course="Python";
        student obj=new student(name,age,course);
        obj.display();
    }
}
