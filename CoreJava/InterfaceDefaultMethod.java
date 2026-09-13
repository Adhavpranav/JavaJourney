package CoreJava;

interface VehicleInterface{
    void start();
    default void fuelType(String type){// its a default method
        System.out.println("Uses  Fuel:"+type);
    }
}

class CarClass implements  VehicleInterface{
    @Override
     public void start(){
        System.out.println("Starting Car");
    }
   
}

class ElectricCar implements  VehicleInterface{
    @Override
    public void start(){
        System.out.println("Starting ElectricCar");
    }
}

public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        VehicleInterface electricCar = new ElectricCar();
        VehicleInterface carClass = new CarClass();

        electricCar.start();
        electricCar.fuelType("Electric");

        carClass.start();
        carClass.fuelType("Petrol");
    }
}
