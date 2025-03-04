package lesson24__03_12_24_Interface.classwork24.flyers;

// Поддержка множественной реализации.
// Класс может реализовывать любое количество интерфейсов.
// Это нам позволяет частично обойти все ограничения на множественное наследование.
public class Duck implements Flyable, Swimmable{

    @Override
    public void fly() {
        System.out.println("Duck is flying");// Утка летит
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming"); // Утка плывет

    }
}
