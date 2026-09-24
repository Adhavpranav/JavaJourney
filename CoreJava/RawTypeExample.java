package Generics;

class BoxClass<T>{
    T value;

    void set(T value){
        this.value=value;
    }

    T get(){
        return value;
    }
}

public class RawTypeExample {
    public static void main(String[] args) {
        BoxClass obj=new BoxClass();// its raw para class
        
        obj.set("Pranav");
        Object value = obj.get();
        System.out.println(value);
        obj.set(100.2);
        value = obj.get();
        System.out.println(value);
        obj.set(100);

         value = obj.get();
        System.out.println(value);
    }
}
