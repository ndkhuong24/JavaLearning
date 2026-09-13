package BaiTapInheritance;

public class CarBaiTapInheritance extends VehicleBaiTapInheritance {
    public CarBaiTapInheritance(String brand, int speed) {
        super(brand, speed);
    }

    public CarBaiTapInheritance() {
    }

    @Override
    public void drive() {
        System.out.println("Xe ô tô đang di chuyển");
    }
}
