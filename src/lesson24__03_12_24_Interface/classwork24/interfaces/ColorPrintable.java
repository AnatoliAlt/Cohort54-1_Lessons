package lesson24__03_12_24_Interface.classwork24.interfaces;
// Инерфейс может расширять другой интерфейс.
// Для расширения используется ключевое слово extends.
// Дочерний инерфейс наследует все методы родительского интерфейса.
public interface ColorPrintable extends Printable{

    void colorPrint();

    // Без этой строчки интерфейс получил бы реализацию по умолчанию от Printable
    //void defaultMethod();
}
