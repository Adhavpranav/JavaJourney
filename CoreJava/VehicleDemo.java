package CoreJava;

abstract class VehicleOperations{
    abstract void start();
    protected void stop(){
        System.out.println("Vehicle stopped");
    }
}

class CarOperations extends VehicleOperations{
    protected void start(){
        System.out.println("Car starts with a key");
    }
}

class BikeOperations extends VehicleOperations{
    protected void start(){
        System.out.println("Bike starts with a button");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        VehicleOperations bikeOperations=new BikeOperations();
        VehicleOperations carOperations=new CarOperations();
        bikeOperations.start();
        bikeOperations.stop();
        carOperations.start();
        carOperations.stop();
    }
}
