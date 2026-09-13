package CoreJava;

interface AnimalInterface{
    void eat();
}

interface Mammal extends  AnimalInterface{
    void walk();
}

class Human implements Mammal{
    @Override
    public void eat() {
        System.out.println("Human eats");
    }
    @Override
    public void walk() {
        System.out.println("Human walks");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Mammal mammal=new Human();
        mammal.eat();
        mammal.walk();
    }
}
