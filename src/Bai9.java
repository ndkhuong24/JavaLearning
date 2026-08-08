public class Bai9 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
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
        //Tìm số lớn nhất.
        int numberMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numberMax) {
                numberMax = numbers[i];
            }
        }
        System.out.println(numberMax);

        //Tìm số bé nhất
        int numberMin;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numberMax) {
                numberMax = numbers[i];
            }
        }
        System.out.println(numberMax);
    }
}
