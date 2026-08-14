package Basic;

public class BaiTapPhan10 {
    public static void main(String[] args) {
        String text = "Hello Java";

        // a, e, i, o, u
        int count = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == 'e' || text.charAt(i) == 'a' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Số nguyên âm có trong đoạn văn bản trên là: " + count);

        //
    }
}
