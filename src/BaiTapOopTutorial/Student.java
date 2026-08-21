package BaiTapOopTutorial;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Tôi tên là " + name + ", năm nay " + age + " tuổi");
    }

    public void haveBirthday() {
        age++;
    }
}
