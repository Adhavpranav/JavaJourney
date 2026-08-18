package CoreJava;
import  java.util.*;

class Animal{
    protected void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    protected void bark(){
        System.out.println("Dog is barking");
    }
}

public class BasicInheritance{
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eat();
        obj.bark();
    }
}
