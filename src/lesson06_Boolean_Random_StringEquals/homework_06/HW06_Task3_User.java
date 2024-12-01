package lesson06_Boolean_Random_StringEquals.homework_06;
/*
Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */

import java.util.Scanner;

public class HW06_Task3_User {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число.");
        int userNumber = scanner.nextInt();
        System.out.println("Число пользователя: " + userNumber);

        boolean a = userNumber % 2 == 0;
        System.out.println("Число пользователя четное: - " + a);

        boolean b = userNumber % 3 == 0;
        System.out.println("Кратно 3: " + b);

        System.out.println("Число пользователя четное: - " + a + " и "
                + "Кратно 3: " + b);
    }
}
