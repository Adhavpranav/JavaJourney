package Generics;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

interface Printable {
    void print();
}

class Dog extends Animal implements Printable{
    @Override
    public void print(){
        System.out.println("Dog is printing");
    }
}

class Test<T extends Animal & Printable>{

    T obj;
    Test(T obj){
        this.obj=obj;
    }

    void show(){
        obj.eat();
        obj.print();
    }
}

public class MultipleBoundsExample {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Test<Dog> test = new Test<>(dog);
        test.show();
    }
}
