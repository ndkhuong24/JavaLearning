package TutorialOOP;

public class Car {
    // FIELD — dữ liệu
    private String brand;
    private String color;
    private int speed;

    Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    //    // METHOD — hành động
//    void driver() {
//        System.out.println("Driver");
//    }
//    String action(String command) {
//        return command;
//    }
}
