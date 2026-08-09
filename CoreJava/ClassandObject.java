package CoreJava;

import java.sql.SQLOutput;

public class ClassandObject {
    static class Car{
        String brand;
        String model;
        int year;
    }

    public static void main(String[] args) {
        Car obj1=new Car();
        obj1.brand="Bmw";
        obj1.model="Classic";
        obj1.year=2000;

        Car obj2=new Car();
        obj2.brand="Ferrai";
        obj2.model="Sport";
        obj2.year=2005;

        System.out.println(obj1.brand);
        System.out.println(obj1.model);
        System.out.println(obj1.year);

        System.out.println(obj2.brand);
        System.out.println(obj2.model);
        System.out.println(obj2.year);
    }
}
