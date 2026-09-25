package Generics;

interface Storage<T>{
    public void show();
}

class IntegerStorage implements  Storage<Integer>{
    Integer value;
    public IntegerStorage(Integer value){
        this.value=value;
    }
    @Override
    public void show(){
        System.out.println(value);
    }
}

public class GenericInterfaceExample {
    public static void main(String[] args) {

        IntegerStorage integerStorage=new IntegerStorage(10);
        integerStorage.show();
    }
}
