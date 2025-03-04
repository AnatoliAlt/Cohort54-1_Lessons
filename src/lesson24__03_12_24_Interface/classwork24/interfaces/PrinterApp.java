package lesson24__03_12_24_Interface.classwork24.interfaces;

public class PrinterApp {
    public static void main(String[] args) {

        Printable book = new Book("Философия Java", "Б.Эккель");

        book.print(); // Метод void print(); из класса public interface Printable
        // Вызов метода - печатать, для распечатывания - Book: Философия Java (Б.Эккель)

        // book.uniqueMethod();
        // uniqueMethod  (Class Book) - По ссылке типа интерфейс, вызвать
        // метод класса, которого нет в классе интерфейс, не возможно.

        // Доступны методы Object.
        System.out.println("Доступны методы Object (например - toString): " + book.toString());

        book.defoultMethod();

        // Начиная с JDK 8 доступны статические методы в интерфейсе.
        // Вызвать статический метод мы можем только от имени класса инторфейс
        Printable.staticMrthod();


        System.out.println("========= Journal ================");

        Printable journal = new Journal("Cossmoliton", 154);
        journal.print();
        journal.defoultMethod();

        System.out.println("======== Presentation ==============");

        ColorPrintable colorPrintable = new Presentation(
                "Inheritance",
                "Noname",
                "Inheritance in OOP",
                20
        );
        colorPrintable.print();
        colorPrintable.colorPrint();
        colorPrintable.defoultMethod();
    }
}
