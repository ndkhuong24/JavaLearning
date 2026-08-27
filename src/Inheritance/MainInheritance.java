package Inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        CarInheritance car = new CarInheritance("BMW", 120);

        System.out.println(car.brand);
        System.out.println(car.speed);

        car.drive();
        car.honk();
    }
}
