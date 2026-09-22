package Generics;

class Box<T>{
    T value;
    Box(T value){
        this.value = value;
    }
    void display(){
        System.out.println(value);
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        Box<String>box1=new Box<>("Pranav");
        box1.display();//Pranav

        Box<Integer>box2=new Box<>(10);
        box2.display();//10
    }
}
