package Opp;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(); // Đây là 1 object
        car1.brand = "BMW"; //
        car1.color = "Red"; //Field
        car1.speed = 120;   //
        car1.driver(); // method
        System.out.println(car1.action("Bạn đang lái xe"));//Chỉ trả về dữ liệu phải dùng sout để in ra
        System.out.println(car1.brand + " " + car1.color + " " + car1.speed);

    }
}
