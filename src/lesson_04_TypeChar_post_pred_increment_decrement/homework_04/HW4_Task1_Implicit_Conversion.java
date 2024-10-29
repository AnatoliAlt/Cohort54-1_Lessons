package lesson_04_TypeChar_post_pred_increment_decrement.homework_04;
/*
Task 1
Неявное преобразование int в double
Напишите программу, которая:

Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.
Ожидаемый результат:

Значение myDouble: 10.0
 */
public class HW4_Task1_Implicit_Conversion {
    public static void main(String[] args) {

        // Неявное преобразование

        int myInt = 10; // Значение
        double myDouble = myInt;

        System.out.println("Value myDouble: " + myDouble);

    }
}
