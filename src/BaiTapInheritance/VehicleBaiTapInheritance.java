package BaiTapInheritance;

public class VehicleBaiTapInheritance {
    private String brand;
    private int speed;

    public VehicleBaiTapInheritance(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public VehicleBaiTapInheritance() {
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void drive() {
        System.out.println("Vehicle đang di chuyển");
    }
}
