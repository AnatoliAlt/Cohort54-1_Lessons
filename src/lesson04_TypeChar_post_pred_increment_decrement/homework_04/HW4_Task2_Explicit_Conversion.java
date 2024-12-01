package lesson04_TypeChar_post_pred_increment_decrement.homework_04;
/*
Task 2
Явное преобразование double в int
Напишите программу, которая:

Объявляет переменную double с именем myDouble и присваивает ей значение 5.99.
Преобразует myDouble в int с помощью явного преобразования и сохраняет результат в переменную int с именем myInt.
Выводит значение myInt на экран.
Ожидаемый результат:

Значение myInt: 5
 */

public class HW4_Task2_Explicit_Conversion {
    public static void main(String[] args) {

        // Явное преобразование

        double myDouble = 5.99;

        int myInt = (int) myDouble;

        System.out.println("value myInt: " + myInt);

    }
}
