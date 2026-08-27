package Inheritance;

public class CarInheritance extends VehicleInheritance {

    public CarInheritance(String brand, int speed) {
        super(brand, speed);
    }

    public void honk() {
        System.out.println("Bíp bíp!");
    }
}