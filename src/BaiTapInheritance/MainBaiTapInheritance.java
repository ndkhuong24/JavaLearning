package BaiTapInheritance;

public class MainBaiTapInheritance {
    public static void main(String[] args) {
        VehicleBaiTapInheritance[] vehicleBaiTapInheritances = {
                new CarBaiTapInheritance("BMW", 120),
                new MotorbikeBaiTapInheritance("Honda", 80)
        };

        for (VehicleBaiTapInheritance vehicleBaiTapInheritance : vehicleBaiTapInheritances) {
            vehicleBaiTapInheritance.drive();
        }
    }
}
