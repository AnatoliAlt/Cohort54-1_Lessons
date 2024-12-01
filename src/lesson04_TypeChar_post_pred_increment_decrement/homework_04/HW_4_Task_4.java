package lesson04_TypeChar_post_pred_increment_decrement.homework_04;

/*
Task 4 * (Опционально)
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.

Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.

Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций), и выведите результат.

Пример программы:

public class Main {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';

        // Ваш код
    }
}
Copy
Output:

HANNA
Copy
Пояснение
Переменные ch1, ch2, ch3, ch4 и ch5 должны быть преобразованы из нижнего регистра в верхний с использованием только арифметических операций.
Вывод результата должен быть в виде строки с именем в верхнем регистре.
*2024

AIT-TR
 */
public class HW_4_Task_4 {
    public static void main(String[] args) {

        char ch1 = 'a';
        char ch2 = 'n';
        char ch3 = 'a';
        char ch4 = 't';
        char ch5 = 'o';
        char ch6 = 'l';
        char ch7 = 'i';

        System.out.println("My name is " + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7);

        char aa = 65;
        char n = 78;
        char a = 65;
        char t = 84;
        char o = 79;
        char l = 76;
        char i = 73;

        System.out.println("My name is " + aa + n + a + t + o + l + i);
        //System.out.println("My name: " +);

        // a = 97  A = 65 -> 97 - 65 = 32
        // z = 122 Z = 90 -> 122 - 90 = 32


        System.out.println(ch1);
        System.out.println((int) ch1);
        System.out.println((int) 'a');

        ch1 -= 32;
        ch2 -= 32;
        ch3 -= 32;
        ch4 -= 32;
        ch5 -= 32;
        ch6 -= 32;
        ch7 -= 32;
        System.out.println("My name is " + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7);



    }
}
