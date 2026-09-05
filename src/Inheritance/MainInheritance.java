package Inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        CarInheritance car = new CarInheritance("BMW", 120);
        MotorbikeInheritance motorbike = new MotorbikeInheritance("BMW", 220);

        System.out.println(car.brand);
        System.out.println(car.speed);
        System.out.println(motorbike.speed);
        System.out.println(motorbike.speed);

        car.drive();
        car.honk();

        motorbike.drive();
    }
}
