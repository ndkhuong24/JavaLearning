public class Bai123456 { // class có thể hiểu là định nghĩa của đối tượng, public là phạm vi truy cập
    public static void main(String[] args) { // main là điểm khởi đầu của dự án nó sẽ chạy bắt đầu từ main, bắt buộc phải có public ở đây để JVM có thể đọc đc mail
//        ///Bài 1: Hello Java
//        String name = "Nguyễn Duy Khương";
//        int age = 22; // int là kểu dữ liệu, age là tên biến, 22 là giá trị truyền vào biến
//        double height = 1.73;
//        boolean isStudent = true;
//
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(height);
//        System.out.println(isStudent);
//
//        /// Bài 2: Biến (Variables)
//        char grade = 'A';
//        long population = 100000000;
//        float score = 9.5f;
//
//        System.out.println(grade);
//        System.out.println(population);
//        System.out.println(score);
//
//        double a = 9.5f; //byte → short → int → long → float → double có thể chuyển từ kiểu nhỏ sang kiểu lớn
//        System.out.println(a);
//
//        /// Bài 3: Toán tử (Operators)
//        int ab3 = 10;
//        int bb3 = 3;
//
//        System.out.println(ab3 + bb3);
//        System.out.println(ab3 - bb3);
//        System.out.println(ab3 * bb3);
//        System.out.println(ab3 / bb3); //ab3 và bb3 đều là số nguyên nên nó sẽ lấy phần nguyên bỏ đi phần còn lại
//        System.out.println(ab3 % bb3); // lấy phần dư 10/3=3 dư 1System.out.println(ab3 + bb3);

//        System.out.println(ab3 ++ );
//        System.out.println(ab3 -- );
//        System.out.println(ab3 += bb3);
//        System.out.println(ab3 -= bb3);
//        System.out.println(ab3 *= bb3);
//        System.out.println(ab3 /= bb3);

        //Bài 4: Toán tử so sánh (Comparison Operators)
//        System.out.println(ab3 == bb3); //a có bằng b không
//        System.out.println(ab3 != bb3); //a có khác b không
//        System.out.println(ab3 > bb3); //a có lớn hơn b không
//        System.out.println(ab3 < bb3); //a có nhỏ hơn b không
//        System.out.println(ab3 >= bb3); // a có lớn hơn hoặc bằng b không
//        System.out.println(ab3 <= bb3); // a có nhỏ hơn hoặc bằng b không

        //Bài 5: Toán tử Logic (Logical Operators)
//        int age = 25;
//
//        System.out.println(age > 18 && age < 30);
//
//        System.out.println(age < 18 || age > 30);
//
//        System.out.println(!(age == 25));

        //Bài 6: if, else if, else
//        int age = 15;
//
//        if (age >= 18) {
//            System.out.println("Đã đủ tuổi");
//        } else {
//            System.out.println("Chưa đủ tuổi");
//        }

        int money = 250000;
        boolean vip = true;

        if(money > 200000 && vip == true){
            System.out.println("Giảm giá 20%");
        }else if(money > 200000 && vip != true || money > 200000){
            System.out.println("Giảm giá 10%");
        }else{
            System.out.println("Bạn không được giảm giá");
        }

        if (money > 200000 && vip) {
            System.out.println("Giảm giá 20%");
        } else if (money > 200000) {
            System.out.println("Giảm giá 10%");
        } else {
            System.out.println("Bạn không được giảm giá");
        }
    } // static là dùng chung cho class, void có nghĩa là không trả về cái gì cả, println có nghĩa là in xuống dòng, string[] là truyền vào một mảng
}


