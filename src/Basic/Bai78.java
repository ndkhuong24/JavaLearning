package Basic;

public class Bai78 {
    public static void main(String[] args) {
        //Bài 7: Switch - case
//        int choice = 1;
//        double balance = 1000000;
//
//        switch (choice) {
//            case 1:
//                System.out.println("In số dư " + balance + "VND");
//                break;
//            case 2:
//                System.out.println("Bạn đã chọn nạp tiền");
//                break;
//            case 3:
//                System.out.println("Bạn đã chọn rút tiền");
//                break;
//            case 4:
//                System.out.println("Cảm ơn đã sử dụng");
//                break;
//            default:
//                System.out.println("Lựa chọn không hợp lệ");
//                break;
//        }

        //Bài 8: for
//        for (int tenBien = 1; tenBien <= 10; tenBien++) { //for ( Khởi tạo ; Điều kiện ; Cập nhật )
//            if (tenBien % 2 == 0) { //trong if sẽ là true hoặc false nên sẽ dùng cách number % 2 == 0 số chẵn và number % 2 != 0 số lẻ
//                System.out.println(tenBien);
//            } else if (tenBien % 2 != 0) {
//                System.out.println(tenBien);
//            }
//        }

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " là số chẵn");
            } else {
                System.out.println(i + " là số lẻ");
            }
        }
    }
}
