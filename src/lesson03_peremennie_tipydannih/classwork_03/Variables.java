package lesson03_peremennie_tipydannih.classwork_03;

public class Variables {
    public static void main(String[] args) {
        int myFirstVariable;
        myFirstVariable = 1;
        int mySecondVariable = 25;
        System.out.println(mySecondVariable);
        mySecondVariable = 50;
        System.out.println("Значение переменной mySecondVariable: " + mySecondVariable);

        byte byteVariable = 125; // Объявление и иницилизаця переменной типа byte
        System.out.println("byteVariable: " + byteVariable);

        byteVariable = -100;
        System.out.println("byteVariable: " + byteVariable);

        short shortVariable;
        shortVariable = 31000;
        System.out.println("shortVariable: " + shortVariable);

        // Знак _ не влияет на значение переменной
        long longVariable = 2_100_000_000_000_000_000L;
        System.out.println("longVariable: " + longVariable);

        double doubleVar = 10.5421; // Обьявление и инициализация типа double
        System.out.println("doubleVar: " + doubleVar);

        float floatVar = 11.65f;// f - Число в формате float
        System.out.println("floatVar: " + floatVar);

    }
}
