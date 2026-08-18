package CoreJava;

class Vehicle {
    protected int speed=100;
    protected void drive(){
        System.out.println("Vehicle is driving");
    }
}

class CarDetails extends Vehicle{
    protected String brand="BMW";
    protected void showCar(){
        System.out.println("Brand :"+brand);
        System.out.println("Speed :"+speed);
    }
}

public class VehicleCarInheritance {
    public static void main(String[] args) {
        CarDetails obj=new CarDetails();
        obj.drive();
        obj.showCar();
    }
}
