package lesson_15__31_10_24_OOP_Abstraction_Constructor.classwork15;

public class CW15_CatsMain1 {
    public static void main(String[] args) {

        // new Cat(); - // Объект создан, но я не могу получить информацию о свойствах этого объекта
        // Не могу вызывать методы, так как у меня нет "пульта управления" (переменной, которая хранит ссылку на этот объект)
        // Такой объект будет удален из памяти Сборшиком мусора (Garbage Collector)

        CW15_Cat cat = new CW15_Cat();// Создаем объект класса Cat

        // 1. Физически создается объект в памяти
        // 2. Вызывается конструктор класса для инициализации свойств
        // объекта (заполнение полей начольными значениями)
        // 3. Конструктор по умолчанию проинициализирует поля ЗНАЧЕНИЯМИ ПО УМОЛЧАНИЮ.

        cat.sayMeow();
        cat.run();
        cat.slep();

        /*
        ЗНАЧЕНИЯ ПО УМОЛЧАНИЮ

        При создании объекта (экземпляра класса) все его поля инициализируются
        значениями по умолчанию
        Для всех примитивов (в том числе char) -> значения по умолчанию -> 0 / 0.0
        boolean -> false
        Для всех ссылочных типов (в том числе String) -> null
         */

        String catName = cat.name;
        System.out.println("Имя: " + catName);

        int catAge = cat.age;
        System.out.println("Возраст: " + catAge);

        System.out.println("\n ============================================ \n");

        //------ 02:08:35 Параметризированый конструктор Cat1---------/

        CW15_Cat cat1 = new CW15_Cat("Max");

        cat1.sayMeow();
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        System.out.println(cat1.color);

        System.out.println("\n----- Метод info ------\n");
        cat1.info();

        System.out.println("\n================= Cat2 ====================\n");

        CW15_Cat cat2 = new CW15_Cat("Diamond", "red");
        // Распичатываем
        cat2.info();

        System.out.println("\n ======= Cat3 ================\n");
        CW15_Cat cat3 = new CW15_Cat("Peter", "black", 8);
        cat3.info();

        System.out.println("\n ========= Cat4 =========== \n");
        CW15_Cat cat4 = cat3;

        cat3.info();
        cat4.info();

        cat3.age = 11;
        cat3.info();
        cat4.info();
        System.out.println();
        cat4.name = "Mary";
        cat4.info();
        cat3.info();

        System.out.println("\n ======== new Cat4 ======= \n");

        cat4 = new CW15_Cat("Barsik", "white", 1);

        cat4.info();
        cat3.info();

    }
}
