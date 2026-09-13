package BaiTapInheritance;

public class MotorbikeBaiTapInheritance extends VehicleBaiTapInheritance{
    public MotorbikeBaiTapInheritance(String brand, int speed) {
        super(brand, speed);
    }

    public MotorbikeBaiTapInheritance() {
    }

    @Override
    public void drive() {
        System.out.println("Xe máy đang di chuyển");
    }
}
