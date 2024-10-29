package lesson_07__01_10_24_if_Switch_StringEquals.homework;
/*
                                         Home Work 7
                                           Task 4
Напишите программу с использованием оператора switch:

Программа просит пользователя ввести число от 1 до 7. Если число равно 1, выводим на
консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
 */

import java.util.Random;

public class HW_07_Task4_Switch_DayWeek {
    public static void main(String[] args) {
        System.out.println("___________________________________________________");
        System.out.println(" Home Work 7                        Task 4");
        Random random = new Random();
        int days = random.nextInt(8) + 1;
        System.out.println("Сгенерированное случайное число: " + days);

        switch (days) {
            case 1:
                System.out.println("Monday"); // Понедельник
                break;
            case 2:
                System.out.println("Tuesday"); // Вторник
                break;
            case 3:
                System.out.println("Wednesday"); // Среда
                break;
            case 4:
                System.out.println("Thursday"); // Четверг
                break;
            case 5:
                System.out.println("Friday"); // Пятница
                break;
            case 6:
            case 7:
                System.out.println("Выходной!"); // Суббота, Воскресенье
                break;
            default:
                System.out.println("===== Неделя закончилась! =========");
                System.out.println("________________________________________________________________-");
        }
    }
}
