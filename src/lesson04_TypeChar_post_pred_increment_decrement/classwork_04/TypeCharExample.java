package lesson04_TypeChar_post_pred_increment_decrement.classwork_04;

public class TypeCharExample {
    public static void main(String[] args) {

        char a = 'A'; // Переменная будет хранить букву А латинского алфавита
        char a1 = 65; // Переменная будет хранить букву А латинского алфавита, соответвующую коду 65
        // в десятичной системе счисления
        char a2 = 0x41; // Присваиваем код в 16-ном формате. Что будет соответствовать все той же букве А
        a2 = 0x0041; // полная форма записи числа в 16 системе счисления
        char a3 = '\u0041'; // Еще один способ задать значение в 16 формате
        char x = '\u1507';

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("x: " + x);

        char digit0 = 48;
        System.out.println("digit0: " + digit0);

        // digit0 = digit0 + 5;
        // digit0 = (char) (digit0 + 5);
        digit0 += 5;
        System.out.println("digit0: " + digit0);

        char letter = 97;
        System.out.println("letter: " + letter);
        letter++;
        System.out.println("letter: " + letter);

        System.out.println("Преоброзование char -> int даст 10-й код символа: " + (int) letter);
        System.out.println(0 + letter); // так тоже можно кастить, но не нужно
        /*
        0....9 -> соответствуют коды 48.....57
        a....z -> соответствуют кодам 97....122
        A....Z -> соответствуют кодам 65....90
         */
        /*
        1. digit0 (char) -> int
        2. сложение двух int -> int
        3. Нужно явно преоброзовать int в char
         */

    }
}
