package lesson_19__14_11_24.classwork19;

public class ConstantDemo1 {
    // Константа - static final + строка (String) ИЛИ примитивные типы данных (int, double и т.д.).
    // Константа - для опредения константы необходимо добавить модификаторы static final к полю класса
    // Константа - это статическое финальное поле, содержимое которого неизменно
    // Модификатор static - делает эту переменную доступной для всех объектов класса.
    // А модификатор final - делает ее неизменяемой и присвоить значение переменной мы можем только один раз
    // Константой в JAVA считоется та переменная - которую не может изменить ни один объект класса.
    // Константа создается и инициализируется для всех объктов только один раз, сколько бы их не былол.
    // Константами могут быть примитивы, строки (String), какие-то типы данных.
    public static final double PI = 3.141519; // Константа

    // Не является КОНСТАНТОЙ, так как состояние объекта (значение в массиве) могут быть изменены
    public static final int[] ints = new int[10];
    public static final String COUNTRY = "Germany";

    // Не константа. Т.к. значения в массиве можно переписать.
    public static final String[] colors = {"red", "blue", "yellow"};

    private final int x;// Не константа. Т.к. значения могут быть разными для разных объектов.

    public ConstantDemo1(int x) {// Конструктор
        this.x = x;
        colors[1] = "green";
    }

    public int getX() {
        return x;
    }

    public void showCountry() {
        System.out.println("My country is " + COUNTRY);
    }


}