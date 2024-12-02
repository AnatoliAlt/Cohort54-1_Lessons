package lesson15__31_10_24_OOP_Abstraction_Constructor.homework15;

public class HW15_SchoolMain2_2 {

    public static void main(String[] args) {

        HW15_School2 school = new HW15_School2();

        school.klass();
        school.favoriteLesson();
        school.frinds();

        System.out.println("\n ---------------- \n");



        String mainName = school.name;
        System.out.println("Мое имя " + mainName);

        int mainAge = school.age;
        System.out.println("Мой возраст " + mainAge + " лет");

        String mainGenger = school.gender;
        System.out.println("Я " + mainGenger);

        String mainHobby = school.hobby;
        System.out.println("Мое хобби " + mainHobby);


        System.out.println("\n --------------------- \n");

        HW15_School2 school1 = new HW15_School2("Max", 15, "мальчик", "спорт");
        System.out.println(school1.name);
        System.out.println(school1.age);
        System.out.println(school1.gender);
        System.out.println(school1.hobby);

        System.out.println("\n ------------------------ \n");


        HW15_School2 school2 = new HW15_School2("Piter", 13, "мальчик", "играть в футбол.");
        school2.info();

        HW15_School2 school3 = new HW15_School2("Anna", 12, "девочка", "плавать.");
        school3.info();




    }

}
