package CoreJava;

public class Rectangle {
    float length=10.2f;
    float breadth=4.5f;

     public float area(){
        return length* breadth;
     }

    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        System.out.println(obj.area());
    }
}
