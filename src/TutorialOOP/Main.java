package TutorialOOP;

public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car(); // Đây là 1 object
//        car1.brand = "BMW"; //
//        car1.color = "Red"; //Field
//        car1.speed = 120;   //

        Car car1 = new Car("BMW", "Red", 120);
        Car car2 = new Car("Toyota", "Black", -100);

        System.out.println(car2.getSpeed());

//        car1.driver(); // method
//        System.out.println(car1.action("Bạn đang lái xe"));//Chỉ trả về dữ liệu phải dùng sout để in ra
//        System.out.println(car1.brand + " " + car1.color + " " + car1.speed);


    }
}
