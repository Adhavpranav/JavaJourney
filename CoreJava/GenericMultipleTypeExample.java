package Generics;

class Student<T,U>{
    T studentName;
    U studentRollCall;
    Student(T studentName,U studentRollCall){
        this.studentName=studentName;
        this.studentRollCall=studentRollCall;
    }

    void display(){
        System.out.println("Student name :"+studentName);
        System.out.println("Student roll call :"+studentRollCall);
    }
}

public class GenericMultipleTypeExample {
    public static void main(String[] args) {
        Student<String,Integer> student=new Student<>("Ayushi",1);
        Student<String,Integer> student1=new Student<>("Pranav",2);
        student.display();
        student1.display();
    }
}
