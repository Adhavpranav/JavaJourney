package CoreJava;

class AnimalInfo {
    protected void eat(){
        System.out.println("Animal is eating");
    }
}

class DogInfo extends AnimalInfo{
    protected void bark(){
        System.out.println("Dog is barking");
    }
}

class PuppyInfo extends DogInfo{
    protected void play(){
        System.out.println("Puppy is playing");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        PuppyInfo obj=new PuppyInfo();
        obj.eat();
        obj.bark();
        obj.play();
    }
}
