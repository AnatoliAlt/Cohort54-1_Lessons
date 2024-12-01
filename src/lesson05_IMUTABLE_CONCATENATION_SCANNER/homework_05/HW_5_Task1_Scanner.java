package lesson05_IMUTABLE_CONCATENATION_SCANNER.homework_05;
/*
Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */

import java.util.Scanner;

public class HW_5_Task1_Scanner {

    public static void main(String[] args) {
        System.out.println("____- Запрос имени пользователя и вывод этого имени на консоль __________");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");// Введите Ваше имя

        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("______ Количество символов в имени пользователя ___________");
        String userName = name;
        System.out.println("Длина строки имени пользователя: " + userName.length());
        System.out.println();

        System.out.println("_____ Первый и последний символы имени пользователя ________");
        char firstSymbol = userName.charAt(0);
        System.out.println("First symbol from user name: " + firstSymbol);// Первый символ

        char lastSymbol = userName.charAt(userName.length() -1);
        System.out.println("Last symbol from user name: " + lastSymbol);// Последний символ

        System.out.println("____ Десятичный код первого и последнего символа имени ______");
        System.out.println("First symbol code from user name: " + (int) firstSymbol);// Код первого символа имени пользователя
        System.out.println("Last symbol code from user name: " + (int) lastSymbol);




    }
}
