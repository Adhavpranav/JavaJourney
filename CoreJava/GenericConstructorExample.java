package Generics;

class StudentClass{
    <T> StudentClass(T value){
        T temp=value;
        System.out.println(temp);
    }
}

public class GenericConstructorExample {
    public static void main(String[] args) {
        StudentClass studentClass1=new StudentClass(10);
        StudentClass studentClass2=new StudentClass("Ayushi");
        StudentClass StudentClass3=new StudentClass(10.3);
    }
}
