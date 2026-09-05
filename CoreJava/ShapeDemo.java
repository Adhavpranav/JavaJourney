package CoreJava;

abstract class Shape{
    abstract void calculateArea();
    protected void display(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shape{
    protected double radius=4.5;
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is: "+area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.calculateArea();
        shape.display();
    }
}
