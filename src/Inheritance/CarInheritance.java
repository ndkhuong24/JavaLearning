package Inheritance;

public class CarInheritance extends VehicleInheritance {

    public CarInheritance(String brand, int speed) {
        super(brand, speed);
    }

    public void honk() {
        System.out.println("Bíp bíp!");
    }

    @Override // override gì đè lên contruction cha là drive tức là car đang chạy
    public void drive() {
        System.out.println("Car đang chạy");
    }
}