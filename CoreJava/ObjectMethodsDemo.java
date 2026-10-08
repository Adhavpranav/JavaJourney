package CoreJava;

class StudentDetailsClass{
    String name;
    int age;
    StudentDetailsClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void operationsOnObject(StudentDetailsClass studentDetailsClass1,StudentDetailsClass studentDetailsClass2){
        System.out.println(studentDetailsClass1.equals(studentDetailsClass2));
        System.out.println("HashCode of first object: "+studentDetailsClass1.hashCode());
        System.out.println("HashCode of second object: "+studentDetailsClass2.hashCode());
        System.out.println(studentDetailsClass1.getClass());
        System.out.println(studentDetailsClass2.getClass());
    }

}
public class ObjectMethodsDemo {
    public static void main(String[] args) {
        StudentDetailsClass studentDetailsClass1 = new StudentDetailsClass("Ayushi", 21);
        StudentDetailsClass studentDetailsClass2 = new StudentDetailsClass("Ayushi", 21);
        StudentDetailsClass.operationsOnObject(studentDetailsClass1,studentDetailsClass2);
    }
}
