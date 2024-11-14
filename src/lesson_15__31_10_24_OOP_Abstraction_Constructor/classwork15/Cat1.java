package lesson_15__31_10_24_OOP_Abstraction_Constructor.classwork15;

public class Cat1 {

    public static void main(String[] args) {

        CW15_Cat cat = new CW15_Cat();

        cat.sayMeow();// - распичатываем
        cat.run();// - распичатываем
        cat.slep();// - распичатываем

        // Свойства

        String catName = cat.name;// Выводим на консоль свайства
        System.out.println("Имя: " + catName);

        int catAge = cat.age;
        System.out.println("Возраст: " + catAge);

        String catColor = cat.color;
        System.out.println("Цвет: " + catColor);
    }
}
