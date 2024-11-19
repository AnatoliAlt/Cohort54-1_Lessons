package lesson_19__14_11_24.classwork19;

public class LessonApp1_1 {

    public static void main(String[] args) {

        ConstantDemo1 demo = new ConstantDemo1(10);
        System.out.println(demo.getX());

        ConstantDemo1 demo2 = new ConstantDemo1(20);
        System.out.println(demo2.getX());

        System.out.println("ConstantDemo1.COUNTRY: " + ConstantDemo1.COUNTRY);

        // Константа - static final + строка (String) ИЛИ примитивные типы данных (int, double и т.д.).
        // Константа - для опредения константы необходимо добавить модификаторы static final к полю класса
        // Константа - это статическое финальное поле, содержимое которого неизменно
        // Модификатор static - делает эту переменную доступной для всех объектов класса.
        // А модификатор final - делает ее неизменяемой и присвоить значение переменной мы можем только один раз
        // Константой в JAVA считоется та переменная - которую не может изменить ни один экземпляр (объект) класса
        // Константа создается и инициализируется для всех объктов только один раз, сколько бы их не былол.
        // Константами могут быть примитивы, строки (String), какие-то типы данных.

        System.out.println(ConstantDemo1.COUNTRY);

        final String text = "Hello World";
        String text1 = text.toUpperCase();
        System.out.println(text);
        System.out.println("Новая строка, полученая с использованием значеия строки text: " + text1);

        demo.showCountry();
    }
}
