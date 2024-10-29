package lesson_07__01_10_24_if_Switch_StringEquals.classwork;

import java.util.Random;
import java.util.Scanner;

public class If_Example_3 {
    public static void main(String[] args) {

        /*
        if - Условный опеоатор

        */


        int x = 10;

        // if (условие) оператор


        if (x > 11) {
            System.out.println("Всем привет!");
            System.out.println("Сейчас Х равен = " + x + " // true");
        } else if (x > 7) {
            System.out.println("Мы сейчас находимся в блоке ELSE IF");
            System.out.println("Где X равен = " + x + " // true");
        } else {
            System.out.println("Мы сейчас находимся в блоке ELSE (выполняется только если первые два условия - false)");
            System.out.println("Сейчас X равен = " + x);
        }

        System.out.println("Продолжение программы");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 или 10");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("Вы ввели число один");
        } else if (number == 10) {
            System.out.println("Вы ввели число один");
        } else {
            System.out.println("Вы ввели не верное число!!!");
        }
        // Введите число от 1 до 20 или от 30 до 50
        System.out.println("Введите число от 1 до 20 или от 30 до 50");
        number = scanner.nextInt();
        scanner.nextLine();

        /*
             && - (Условное И / Conditional AND) — также работает как логическое И, но с оптимизацией.
        Если первое выражение ложно, то второе не проверяется (короткое замыкание).
    	Пример: false && (5 / 0 == 0) не вызовет ошибки деления на ноль, так как первое выражение уже ложно.
        boolean b6 = false && true;
        System.out.println("false && true: " + b6);
        b6 = (2 > 5) && (11 == 11);
        false && true: false
        false && false: false
        true && false: false
        true && true: true

         */

        if (number >= 1 && number <= 20) {
            System.out.println("Вы ввели число число от 1 до 20");
        } else if (number >= 30 && number <= 50) {
            System.out.println("Вы ввели число число от 30 до 50");
        } else {
            System.out.println("Вы ввели не верное число!!!");
        }

        System.out.println("=========================================================");
        /*
        У ребенка есть корманные деньги. Для простоты используем тип int. И чейчас у него 100 денег.
        Ребенок прешел из  школы и принес оценку (от 1 до 5 включительно)
        Можно запросить оценку из консоли или сгенерировать случайную
        За хорошие оценки ребенок получает деньги, за плохие отбирают.

        5 -> +20
        4 -> +10
        3 -> +0
        2 -> -10
        1 -> забирают все деньги

        Выведите оценку на экран
        Выведите оставшееся количество денег у ребенка.
         */

    }

    public static class Task_Kindergelg_if {
        public static void main(String[] args) {
            int mone = 100;
            int kind;


            //Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            kind = random.nextInt(5) + 1;
            System.out.println("Введите оценку за работу в школе: " + kind);
            //int number = scanner.nextInt();
            //scanner.nextLine();

            if (kind >= 5) {
                System.out.println("За отметку " + kind + ": приз 20 денег");
                mone +=20;
            }else if (kind == 4){
                System.out.println("За отметку  " + kind + ": приз 10 денег");
                mone += 10;
            }else if (kind == 3){
                System.out.println("За отметку " + kind + ": 0 денег");
                mone += 0;
            }else if (kind == 2){
                System.out.println("За отметку " + kind + ": -10 денег");
                mone -= 10;
            }else if (kind == 1){
                System.out.println("За отметку " + kind + ": забирают все деньеги");

            }else {
                System.out.println("Таких отметок не бывает");
            }
            System.out.println("У ребенка сейчас денег: " + mone);

            System.out.println("==================================================");

            int money = 100;
            int note;

            System.out.println("Решение от учителя");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите оценку за работу в школе: ");
            note = scanner.nextInt();
            scanner.nextLine();


            if (note == 5) {
                System.out.println(money += 20);  // money + money + 20
            }else if (note == 4){
                System.out.println(money += 10);
      //      } else if (note == 3){
      //          System.out.println(money += 0);
            }else if (note == 2){
                System.out.println(money -=10);
            }else if (note == 1){
                System.out.println(money + ": забирают все деньеги");
                mone =0;
            }else {
                System.out.println("Таких отметок не бывает");
            }
            System.out.println("У ребенка сейчас денег: " + money);
        }
    }
}





