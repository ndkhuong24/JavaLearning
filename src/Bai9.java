public class Bai9 {
    public static void main(String[] args) {
//        int[] numbers = {10, 20, 30, 40, 50};
//        int sum = 0;
//        //in phần tử đầu
//        System.out.println(numbers[0]);
//        //in phần tử cuối sẽ là số lượng phần từ -1 vì java chạy từ 0
//        System.out.println(numbers[numbers.length - 1]);
//        //dùng for in toàn bộ
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//        //dùng for tính tổng
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i]; //cách rút gọn hơn là sum += numbers[i]; cũng là cộng tổng
//        }
//        System.out.println(sum);

//        int[] numbers = {10, 25, 7, 42, 18, 3, 31};
//        //Tìm số lớn nhất.
//        int numberMax = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > numberMax) {
//                numberMax = numbers[i];
//            }
//        }
//        System.out.println(numberMax);

        //Tìm số bé nhất
//        int numberMin = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < numberMin) {
//                numberMin = numbers[i];
//            }
//        }
//        System.out.println(numberMin);
//
//        //Đếm có bao nhiêu số chẵn.
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
//
//        //Tính tổng các số lẻ
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 != 0) {
//                sum += numbers[i];
//            }
//        }
//        System.out.println(sum);

        int[] numbers = {10, 25, 7, 42, 18, 3, 31};

        // Bài 1: Tìm xem số 18 có nằm trong mảng không.
        boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 18) {
                flag = true;
            }
        }
        if(flag){
            System.out.println("Có số 18 trong mảng");
        }else{
            System.out.println("Không có số 18 trong mảng");
        }
//        System.out.println("Có số 18 trong mảng"); // biến flag đang ko được sử dụng

        //Bài 2: Tìm vị trí (index) của số 42.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 42) System.out.println("Vị trí của số 42 trong mảng là: " + i);
        }

        //Bài 3: Tìm số lớn nhất thứ hai trong mảng.

    }
}
