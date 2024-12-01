package lesson06_Boolean_Random_StringEquals.homework_06;


/*
Task 2
Создайте две переменные типа int.
В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.

Проверьте:
равны ли переменные,
не равны ли они,
больше ли a, чем b,
и меньше ли b, чем a.
Выведите результат на экран.
 */

import java.util.Random;

public class HW06_Task2_Variables {
    public static void main(String[] args) {

        Random random = new Random();

        // Случайные переменные a и b
        int a = random.nextInt(51);
        int b = random.nextInt(101);
        //int c = random.nextInt(-20);


        System.out.println("Полученное значение int a: " + a);
        System.out.println("Полученное значение int b: " + b);

        boolean check = a == b;
        System.out.println("Полученное значение a равно b?      - " + (a == b));
        check = a != b;
        System.out.println("Полученное значение a не равно b?   - " + (a != b));
        check = a > b;
        System.out.println("Полученное значение a больше чем b? - " + (a > b));
        check = b < a;
        System.out.println("Полученное значение b меньше чем a? - " + (b < a));

    }
}
