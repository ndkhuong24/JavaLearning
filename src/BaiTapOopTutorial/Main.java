package BaiTapOopTutorial;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("An", 20);
//        Student student2 = new Student("Bình", 21);
//
//        student1.introduce();
//        student2.introduce();

        Student student1 = new Student("An", 20);

        student1.haveBirthday();
        student1.introduce();

        student1.haveBirthday();
        student1.introduce();
    }
}
