package CoreJava;

class Outer{
    static class Inner{
        void display(){
            System.out.println("This is a static nested class.");
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer.Inner();
        obj.display();
    }
}
