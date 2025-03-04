package lesson24__03_12_24_Interface.classwork24.interfaces;

// public abstract class Book implements Printable{
// Класс реализует (имплементирует) интерфейс.
// Если класс не реализовал ВСЕ абстрактные методы интерфейса, он обязан объявить себя ->
// -> абстракным - public abstract class Book implements Printable {
public class Book implements Printable { //  implements - реализовать, добавить к реализации
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("Book: %s (%s)\n", title, author);
    }

    public void uniqueMethod() {
        System.out.println("uniqueMethod");
    }
    // Не могу переопределить приватный метод.
   // @Override
   // void ppivateMethod(){
   //
   // }
}
