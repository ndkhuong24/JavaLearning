package Opp;

public class Car {
    // FIELD — dữ liệu
    String brand;
    String color;
    int speed;

    Car (String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // METHOD — hành động
    void driver() {
        System.out.println("Driver");
    }
    String action(String command) {
        return command;
    }
}
