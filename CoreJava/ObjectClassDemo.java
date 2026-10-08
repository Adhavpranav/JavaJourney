package CoreJava;

class StudentData{
    private String name;
    private int age;
    private String course;
    public StudentData(String name, int age,String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", course='" + course + "'}";
    }
}

public class ObjectClassDemo{
    public static void main(String[] args) {
        StudentData studentData=new StudentData("Pranav",21,"Python devloper");
        System.out.println(studentData.toString());
        System.out.println(studentData);
    }
}
