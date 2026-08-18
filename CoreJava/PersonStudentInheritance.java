package CoreJava;

class Person{
    protected String name;
    Person(String name){
        this.name=name;
    }
    protected void showName(){
        System.out.println("Name :"+name);
    }
}

class StudentDetail extends Person{
    protected int rollNo;
    StudentDetail(int rollNo,String name){
//        this.rollNo=rollNo; super must be first
        super(name);
        this.rollNo=rollNo;
    }
    protected void showStudent(){
        System.out.println("Roll Number :"+rollNo);
    }
}

public class PersonStudentInheritance {
    public static void main(String[] args) {
        StudentDetail obj=new StudentDetail(1,"Ayushi");
        obj.showStudent();
        obj.showName();
    }
}
