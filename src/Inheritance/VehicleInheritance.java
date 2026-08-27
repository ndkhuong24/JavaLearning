package Inheritance;

public class VehicleInheritance {

    protected String brand;
    protected int speed;

    public VehicleInheritance(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void drive() {
        System.out.println("Vehicle đang chạy");
    }
}