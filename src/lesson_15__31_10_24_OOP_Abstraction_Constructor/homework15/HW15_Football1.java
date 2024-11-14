package lesson_15__31_10_24_OOP_Abstraction_Constructor.homework15;
/*
Task 1
Посмотрите вокруг себя.
Напишите три класса, описывающие какие-то сущности вокруг Вас.

Не забудьте использовать абстракцию.

Например, опишите студента, преподавателя и, допустим, врача.

Вы можете выбрать свои сущности для описания.
 */

public class HW15_Football1 {

    String name;
    int age;

    public HW15_Football1() {

    }

    public HW15_Football1(String name, int age) {
        // this(name, age);
        this.name = name;
        this.age = age;
    }

    public void coach() {// Тренер
        System.out.println("Я тренер и я тренерую!");
    }

    public void athlete() {
        System.out.println("Я играю в футбол!");
    }

    public void fan() {
        System.out.println("Я болею за команду!");
    }

    public void info1() {
        System.out.printf("Я тренер и меня зовут %s. Мне %d лет.\n", name, age);
    }

    public void info2() {
        System.out.printf("Я футболист и меня зовут %s. Мне %d лет.\n", name, age);
    }

    public void info3() {
        System.out.printf("Я болельщик и меня зовут %s. Мне %d лет.\n", name, age);
    }


}
