package CoreJava;

class Car{
    String brand;
    String model;
    double price;

    Car(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    Car(Car obj){
        this.brand=obj.brand;
        this.model= obj.model;;
        this.price= obj.price;
    }

    void display(){
        System.out.println("Car Brand="+brand);
        System.out.println("Car model:"+model);
        System.out.println("Car price:"+price);
        System.out.println();
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Car obj1=new Car("Bmw","M3",143);
        Car obj2=new Car(obj1);

        obj1.display();
        obj2.display();

    }
}
