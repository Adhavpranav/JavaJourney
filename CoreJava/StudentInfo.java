package CoreJava;

class College{
    void addStudent(StudentInfo student){
        System.out.println(student.name);
    }
}
public class StudentInfo {
    String name;
    int age;

    StudentInfo(String name,int age){
        this.name=name;
        this.age=age;
    }

    void register(College college){
        college.addStudent(this);
    }

    public static void main(String[] args) {
        StudentInfo student=new StudentInfo("Ayushi",20);
        College clg=new College();
        student.register(clg);
    }
}
