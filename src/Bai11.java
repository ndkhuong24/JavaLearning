public class Bai11 {
    //    public static void sayHello() {
//        System.out.println("Hello World");
//    }
//    public static void sayHelloCoThamSo(String name) {
//        System.out.println("Hello " + name);
//    }
//
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            sayHello();
//            sayHelloCoThamSo("Khương");
//        }
//
//        int result = add(10, 20);
//        System.out.println(result);
//    }

    // Bài tập bài 11
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static int multiply(int a, int b) {
//        return a * b;
//    }
//
//    public static boolean isEven(int number) {
    /// /        return number % 2 == 0; kiểu này ngắn gọn hơn
//        if (number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(add(1, 2));
//        System.out.println(multiply(1, 2));
//        System.out.println(isEven(1));
//    }

    static int[] numbers = {10, 25, 7, 42, 18, 3, 31};

    static int findMax(int[] numbersArray) {
        int max = numbersArray[0];
        for (int i : numbersArray) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static int findMin(int[] numbersArray) {
        int min = numbersArray[0];
        for (int j : numbersArray) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    static int sumOdd(int[] numbersArray) {
        int sum = 0;
        for (int j : numbersArray) {
            if (j % 2 != 0) {
                sum += j;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findMax(numbers));
        System.out.println(findMin(numbers));
        System.out.println(sumOdd(numbers));
    }
}
