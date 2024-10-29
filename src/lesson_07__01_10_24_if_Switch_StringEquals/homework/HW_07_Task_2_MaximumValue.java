package lesson_07__01_10_24_if_Switch_StringEquals.homework;
/*                                Home Work 7
                                    Task 2
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
 */

import java.util.Random;

public class HW_07_Task_2_MaximumValue {
    public static <num2> void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println(" Home Work 7                        Task 2");

        System.out.println("1. Запишите в 4 переменные случайные числа от 0 до 100.");

        Random random = new Random();

        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);

        System.out.println("2. Выведите все 4 числа на экран.");

        System.out.println("int num1 = " + num1 + " | int num2 = " + num2 + " | int num3 = " + num3 + " | int num4 = " + num4);
        System.out.println();

        System.out.println("3. Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.");
        //System.out.println();
        int maxValue = num1;
        if (num2 > maxValue) {
            maxValue = num2;
        }
        if (num3 > maxValue) {
            maxValue = num3;
        }else if (num4 > maxValue) {
            maxValue = num4;
        }
        System.out.println("Mаксимальное значение - " + maxValue);

        System.out.println("_______  Проверка работы кода _________");

        System.out.println("Value num1 - " + num1 + " - " + (num1 >= maxValue)); // Значение - Value
        System.out.println("Value num2 - " + num2 + " - " + (num2 >= maxValue)); // Значение - Value
        System.out.println("Value num3 - " + num3 + " - " + (num3 >= maxValue)); // Значение - Value
        System.out.println("Value num4 - " + num4 + " - " + (num4 >= maxValue)); // Значение - Value


        System.out.println("___________________________________________________________");
    }
}
