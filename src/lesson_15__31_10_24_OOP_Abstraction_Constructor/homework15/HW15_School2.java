package lesson_15__31_10_24_OOP_Abstraction_Constructor.homework15;

public class HW15_School2 {

    String name;
    int age;
    String gender;
    String hobby;

    public HW15_School2() {

    }

    public HW15_School2(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;

    }

    //public School(String mainName) {
    //    name = mainName;
//
//
    //}

    public void klass() {
        System.out.println("Я учусь в пятом классе.");

    }

    public void favoriteLesson() {
        System.out.println("Мой любимый предмет история.");
    }

    public void frinds() {
        System.out.println("У меня много друзей.");
    }

    public void info() {
        System.out.printf("Меня зовут %s, мой возраст %d лет, я %s и мое хобби %s.\n", name, age, gender, hobby);
    }

}
