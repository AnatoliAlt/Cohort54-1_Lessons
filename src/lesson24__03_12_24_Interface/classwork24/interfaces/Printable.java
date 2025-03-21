package lesson24__03_12_24_Interface.classwork24.interfaces;
/*
Интерфейс - это ссылочный тип в JAVA
Интерфейс - совокупность абстракных методов.

Абстрактный класс описывает свойства и поведение объектов.
А интерфейс содержит только поведение, которое класс будет реализовывать.
 */

// public abstract interface - Интерфейс коссвенно абстрактный
public interface Printable {
    // Интерфейс коссвенно абстрактный. Нам не нужно использовать ключевое слово abstract.

    // В интерфейсе могут быть определены константы ->
    // -> public static final
    int CONST = 10;

    // В интерфейсе не может быть полей и конструкторов

    // Оно присутствует по умолчанию.
    // Все методы интерфейса косвенно абстрактные и публичные.
    // public abstract
    void print();// Абстрактный метод

    // В JDK 8 были добавлены методы по умолчанию.
    // Это методы, которые имеют реализацию по умолчанию, которая используется в случае
    // если класс реализующий интерфейс не переопределит этот метод.
    default void defoultMethod() {
        System.out.println("Defoult Method from interface");
    }
    // Начиная с JDK 8 доступны статические методы в интерфейсе.
    // Вызвать статический метод мы можем только от имени класса инторфейс ->
    // -> Printable.staticMrthod();
    static void staticMrthod() {
        System.out.println("Static method from interface");

    }
    // Начиная с JDK 9 появилась возможность писать приватные методы.
    // Они могут быть статические и не статические.
    // Приватные мнтоды НЕ МОГУТ быть переопределены в классе.
    private void privateMethod(){
        System.out.println("private method from interface - void privateMethod()");

    }
}
