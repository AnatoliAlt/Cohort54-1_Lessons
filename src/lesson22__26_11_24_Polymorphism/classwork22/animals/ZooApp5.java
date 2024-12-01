package lesson22__26_11_24_Polymorphism.classwork22.animals;

public class ZooApp5 {
    /*
    Существует два вида полиморфизма
    1. Статический полиморфизм - полиморфизм времени компиляции
    и достигается он с помощью перегрузки методов (method overloading).
    Перегрузка методов - это когда в рамках одного класса существует несколько методов
    с одинаковым именем, но разным набором параметров.

    2. Динамический полиморфизм - полиморфизм премени выполнения
    и достигается он с помощью переопределения методов (method overriding)
    Переопределение методов происходит когда подкласс (потомок) предоставляет
    специфическую реализауию метода, который уже определен в его супер-классе (родительском классе).
     */
    public static void main(String[] args) {
        /*
        В Java существует class Object
        Класс от которого наследуются все классы в Java.
        Он является корнем иерархии классов.
        Любой класс неявно наследуется от класса Object, если неуказано иное
        (когда класс не расширяет явно другой класс).
        Когда класс не расширяет явно другой класс, он неявно наследуется от класса Object.
         */

        Cat cat2 = new Cat();

        cat2.eat();
        cat2.voice();
        System.out.println(cat2.toString()); // Реализация метода родительсеого класса toString().

        System.out.println("============ Dog =================\n");

        Dog dog3 = new Dog();
        dog3.voice();
        System.out.println(dog3.toString());

        System.out.println("========== Hamster =================\n");

        Hamster hamster4 = new Hamster();
        hamster4.voice();
        // Всегда, когда мы передаем в sout ссылку на объект,
        // автоматически вызывается метод toString для получения строкового представления объекта.
        System.out.println(hamster4.toString());
        // Поэтому не обядательно вызывать метод toString, так как это будет сделано автоматически.
        System.out.println(hamster4);



    }
}
