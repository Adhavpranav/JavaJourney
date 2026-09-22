package Generics;

class Container<T>{
    T value;
    Container(T value){
        this.value = value;
    }
    protected void show(){
        System.out.println(value);
    }
}

public class GenericContainerExample {
    public static void main(String[] args) {
        Container<String> stringContainer=new Container<String>("Java");
        Container<Integer> container = new Container<Integer>(100);
        Container<Double> doubleContainer = new Container<Double>(99.5);

        stringContainer.show();
        container.show();
        doubleContainer.show();
    }
}
