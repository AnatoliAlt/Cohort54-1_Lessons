package lesson07_01_10_24_if_Switch_StringEquals.homework;

import java.util.Scanner;

/*                                  Home Work 7
                             Task 3 (Повышенной сложности, опционально)
1. Программа предлагает пользователю ввести четырехзначное число.
2. Ввод осуществляется только в формате строки (String).
3. Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
4. Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */
public class HW_07_Task_3_StringNumber {
    public static void main(String[] args) {
        System.out.println("__________________________________________________________");
        System.out.println(" Home Work 7                        Task 3");
        System.out.println(" Home Work 7\n" +
                " Task 3 (Повышенной сложности, опционально)");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // 1. Программа предлагает пользователю ввести четырехзначное число.
        System.out.println("1. Введите четырехзначное число:");
        // 2. Ввод осуществляется только в формате строки (String).
        String userNumber = scanner.nextLine();
        System.out.println("2. Число пользователя: " + userNumber);

        // 3. Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
        String strLeng = userNumber;
        // Проверка длины строки чисел
        System.out.println("Длина строки чисел: " + strLeng.length());

        // 4. Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
        if (strLeng.length() == 4) {
            int firstsum = (strLeng.charAt(0) - '0') + (strLeng.charAt(1) - '0');
            int lastSum = (strLeng.charAt(2) - '0') + (strLeng.charAt(3) - '0');
            if (firstsum == lastSum) {
                System.out.println("4. Число пользователя счастливое: " + strLeng);
                System.out.println("Вы выиграли машинку!!!");
            } else {
                System.out.println("4. Число пользователя не счастливое: " + strLeng);
            }
        } else {
            System.out.println("3. Вы ввели не правильное число");
        }

        System.out.println("==================================================================");



    }
}

