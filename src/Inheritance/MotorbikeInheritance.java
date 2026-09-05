package Inheritance;

public class MotorbikeInheritance extends VehicleInheritance{
    public MotorbikeInheritance(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void drive() {
        System.out.println("Xe máy đang chạy");
    }
}
