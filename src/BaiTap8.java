public class BaiTap8 {
    public static void main(String[] args) {
        //Bài 1 - FizzBuzz Mini
//        for (int i = 1; i <= 30; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //Bài 2 - Chia hết cho 3 và 5
//        for (int i = 1; i <= 50; i++) {
//            if (i % 5 == 0 && i % 3 == 0) { // Đặt điều kiện đặc biệt lên trước
//                System.out.println(i + " chia hết cho cả 3 và 5");
//            } else if (i % 5 == 0) {
//                System.out.println(i + " chia hết cho 5");
//            } else if (i % 3 == 0) {
//                System.out.println(i + " chia hết cho 3");
//            } else {
//                System.out.println(i);
//            }
//        }

        //Bài 3 - Bảng cửu chương
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("7 x " + i + " = " + 7 * i);
//        }

        //Bài 4 - Đếm số chẵn và số lẻ
//        int even = 0;
//        int odd = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                even++;
//            } else {
//                odd++;
//            }
//        }
//
//        System.out.println("Tổng số chẵn là: " + even);
//        System.out.println("Tổng số lẽ là: " + odd);

        //Bài 5 - Tổng các số chia hết cho 3
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);

    }
}
