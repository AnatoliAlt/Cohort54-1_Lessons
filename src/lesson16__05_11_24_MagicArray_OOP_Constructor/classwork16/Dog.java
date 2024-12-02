package lesson16__05_11_24_MagicArray_OOP_Constructor.classwork16;

public class Dog {

    // 1. Прописываем поля
    String name;
    int weight;// вес


    // 2. Действие- Cоздаем канструктор
    //  this. - нужен для обращения к текущему объекту (значениям прописаным в полях), в котором вызывается конструктор
    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    // 3. Действие. Создаем метод - info
    void info() {
        System.out.println("I am dog " + name + ", my weight is " + weight);
    }

    // 4. Действие. Создаем метод.
    void eat() {
        System.out.println("Я кушаю, ням-ням! ");
        weight++;
    }
    // 5. Сздаем метод бежать - run (ран)
    void run() {
        /*
        1. Проверить достаточен ли вес собачки для совершения пробежки
        2. Если вес слишком мал - собачка должна поесть перед тренировкой

        */

        //if (weight < 3) {
        // Вес слишком мал. (После тренировки станет или 0, или отрицательное значение)
        // Надо поесть
        while (weight < 3) {
            System.out.println("Сорян! Я худая и голодная. Бежать не могу ");
            System.out.println("Надо поесть. Мой вес сейчас: " + weight);

            // 6. Вызываем метод - кушать
            eat();
        }


        System.out.println("Я бегу");
        weight -= 2;// weight = weight - 2;
        //  weight += 3; weight = weight + 3;
        // weight *= 4;  weight = weight * 4;
        //  weight /= 5; weight = weight / 5;

        System.out.println("Вес после тренеровки: " + weight);
        System.out.println("=========================== \n");


    }

}
