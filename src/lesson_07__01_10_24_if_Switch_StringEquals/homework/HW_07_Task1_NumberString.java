package lesson_07__01_10_24_if_Switch_StringEquals.homework;

import java.util.Random;
import java.util.Scanner;
/*                              Home Work 7
                                  Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.

Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
 */

public class HW_07_Task1_NumberString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 3 - Введите число от 1 до 3");// Введите число от 1 до 3
        int number = scanner.nextInt();
        // scanner.nextInt();
        scanner.nextLine();
        System.out.println("User number: " + number); // Число пользователя
        System.out.println("Второе число -");
        int num1 = scanner.nextInt();
        System.out.println("второе число: " + num1);

        switch (number) {

            case 1:
                System.out.println("You entered the number one (Вы ввели число один)");// Вы ввели число один
                break;
            case 2:
                System.out.println("You entered the two (Вы ввели число два)");// Вы ввели число два
                break;
            case 3:
                System.out.println("You entered the number three (Вы ввели число три)");// Вы ввели число три
                break;
            default:
                System.out.println("You entered an invalid number - Вы ввели не правильное число");// Вы ввели не правильное число
        }
        switch (num1) {

            case 1:
                System.out.println("You entered the number one (Вы ввели число один)");// Вы ввели число один
                break;
            case 2:
                System.out.println("You entered the two (Вы ввели число два)");// Вы ввели число два
                break;
            case 3:
                System.out.println("You entered the number three (Вы ввели число три)");// Вы ввели число три
                break;
            default:
                System.out.println("You entered an invalid number - Вы ввели не правильное число");// Вы ввели не правильное число

        }
        System.out.println("============== Random =================");


        Random random = new Random();
        int num = random.nextInt(4) + 1;
        //scanner.nextInt();
        System.out.println("User number: " + num); // Число пользователя
        switch (num) {

            case 1:
                System.out.println("You entered the number one (Вы ввели число один)");// Вы ввели число один
                break;
            case 2:
                System.out.println("You entered the number two (Вы ввели число два)");// Вы ввели число два
                break;
            case 3:
                System.out.println("You entered the number three (Вы ввели число три)");// Вы ввели число три
                break;
            default:
                System.out.println("You entered an invalid number (Вы ввели не правильное число)");// Вы ввели не правильное число

        }

    }

}
