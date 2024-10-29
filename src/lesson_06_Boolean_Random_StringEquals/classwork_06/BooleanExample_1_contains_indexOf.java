package lesson_06_Boolean_Random_StringEquals.classwork_06;

public class BooleanExample_1_contains_indexOf {
    public static void main(String[] args) {

        boolean bol1 = true; // истина / правда
        bol1 = false; // ложь / не правда

        int x = 10;
        int y = 5;

        System.out.println("______ boolean ___ СРАВНЕНИЕ НА РАВЕНСТВО И НЕ РАВЕНСТВО ________");

        System.out.println("x = 10;");
        System.out.println("y = 5;");

        // Сравнение на равенство " == "
        boolean b1 = (x == y); // X равен Y -> 10 равно 5 -> false
        System.out.println("X равен Y -> 10 равно 5:                        (" + x + " == " + y + " -> " + b1);


        // Сравнение на не равенство " != "
        b1 = x != y; // x не равно y -> 10 не равно 5 -> true
        System.out.println("X не равно Y -> 10 не равно 5:                  (" + x + " != " + y + " -> " + b1);// true


        // Больше ">"
        b1 = x > y; // X больше Y -> 10 больше 5 -> true
        System.out.println("x не равно y -> 10 не равно 5:                  (" + x + " > " + y + " -> " + b1); // false

        x = 10;
        y = 10;
        System.out.println("x = 10;");
        System.out.println("y = 10;");

        // Больше ">"
        b1 = x > y; // X больше Y -> 10 больше 5 -> false
        System.out.println("X больше Y -> 10 больше 5:                      (" + x + " > " + y + " -> " + b1); // true

        // больше либо равно " >= "
        b1 = x >= y;// X больше или равно Y -> 10 больше или равно 10 -> true
        System.out.println("X больше или равно Y -> 10 больше или равно 10: (" + x + " >= " + y + " -> " + b1);


        // Меньше или равно " <= "
        b1 = x <= y; // Х меньше или равно Y -> 10 меньше или равно 10-> true
        System.out.println("X меньше или равно Y -> 10 меньше или равно 10: (" + x + " <= " + y + " -> " + b1);


        System.out.println("______________ метод ___ .contains ____________");

        // CONTAINS - Проверяет строки на наличие определенной послеследованости симвалов

        String str = "Java! is a powerful language!";
        boolean contains = str.contains("Java");
        // System.out.println("str.contains("Java") " + contains );// - В этом ворианте Java выдаст ошибку
        System.out.println("str.contains(\"Java\") " + contains);


        System.out.println("__________ метод ______ .indexOf ____________");

        // indexOf - Индекс начала вхождения подстроки в строку. Если нет вхождения - мы получим -1
        // indexOf - ищет только первое вхождение (the) под строки в строке и на нем останавливается и дальше не ищет.

        System.out.println("Java! is a powerful language!");

        int index = str.indexOf("Java");
        System.out.println("Индекс вхождения -Java- (index): " + index);// Результат индекс 0

        int index1 = str.indexOf("the");
        System.out.println("Индекс вхождения -the- (index1): " + index1);// Результат индекс  -1

        int index2 = str.indexOf("!");
        System.out.println("Индекс вхождения - ! - (index2): " + index2);// Результат индекс 4

        contains = index1 != -1;// Если индекс не равен -1, то вхождение найдено. Сontains будет true. Иначе fols
        System.out.println("contains: " + contains);


        System.out.println("_______ Метод _________ .lastIndexOf _____________");

        // lastIndexOf - Ищет последнее вхождение подстроки в строке, а все первые игнарирует.

        index = str.lastIndexOf("Java");
        System.out.println("Индекс последнего вхождения - Java -: " + index);// Результат индекс 0

        index1 = str.lastIndexOf("the");
        System.out.println("Индекс последнего вхождения - the -: " + index1);// Результат индекс -1

        index2 = str.lastIndexOf("!");
        System.out.println("Индекс последнего вхождения - ! -: " + index2);// Результат индекс 28

        System.out.println("=====================================================");


        System.out.println("_________ Логические операции ___________________________");

        System.out.println("_____ Приоритетная шкала для знаков для вычисления ! -> & -> ^ -> | -> && -> || _______");

        /*
        () - Операция заключенная в скобки в преоритете, то есть делается в первую очередь
        ! - Логическое - НЕ (= равен)(отеицание, NOT)
        & - Логическое - И (AND)
        | - ИЛИ (OR)
        ^ - Логическое исключающее ИЛИ (XOR)
        && - Условное И
        || - Условное ИЛИ
        --------------------------
        */

        // Логическое НЕ (NOT) - отрицание "!"
        // Меняет значение типа boolean на противоположное
        boolean b2 = !false; // Получим значение true
        System.out.println("!false: " + !false);

        b2 = !(4 == 5);// !false -> true
        System.out.println("!(4 == 5): " + b2);// Результат true

        b2 = !(4 != 5);// !true -> false
        System.out.println("!(4 != 5): " + b2);// Результат false


        System.out.println("__ Составные логическе опрерации - объединение двух условий ___");
        /*
         Логическое И "&"
         Используется  когда нужно, чтобы оба уславия были истинными --------------------------------------------- 1
         Рим столица Италии & Берлин столица Голландии
         // Если хотя бы одной части будет false -> то в результате мы получим false
         */
        System.out.println("_____ Логическое И - & ___");
        b2 = true & true;// true
        System.out.println("rue & true; " + b2);
        b2 = (2 < 5) & (11 == 10); // true & false -  результат false
        System.out.println("(2 < 5) & (11 == 10) = " + b2);// результат false

        // Введите число от 0 до 100 Как проверить, число находится в диапазоне чисел 0 и 100
        int z = 50;
        boolean b3 = z > 0 & z < 100;
        System.out.println("z > 0 & z < 100 = " + b3);// результат true

        boolean c6 = false & true;
        System.out.println("false & true: " + c6);
        boolean c10 = false & false;
        System.out.println("false & false: " + c10);
        boolean c11 = true & false;
        System.out.println("true & false: " + c11);
        boolean c9 = true & true;
        System.out.println("true & true: " + c9);


        System.out.println("_____ Логическое ИЛИ - | ___");
        // Логическое ИЛИ "|"
        // Когда достаточно, чтобы ХОТЯ бы ОДНО условие было истинным true ----------------------------------  2

        boolean b4 = true | false;
        b4 = false | false; // false
        System.out.println("false | false: " + b4); // результат false
        System.out.println("true | false: " + (true | false)); // результат true

        // Введдите или четное число, или число, которое делится на 5 без остатка.
        // Четное число - это число, которое делится на 2 без остатка. Остаток от деления числа на 2 равен 0

        System.out.println("_____________ RANDOM __________________________________-");


        System.out.println("_____ Логическое исключающее ИЛИ - ^ - (XOR) __________________________________-");
        // Возвращает true если две части выражения разные

        boolean b5 = true ^ false;// true
        System.out.println("true ^ false: " + b5);

        b5 = false ^ false; // false
        System.out.println("false ^ false: " + b5);// false
        System.out.println("true ^ true: " + (true ^ true));// false
        System.out.println("false ^ true: " + (false ^ true));// true


        System.out.println("_________ Логическое сокращенное ИИ - && - ________ ");
        // Выдает true только если обе части выражения равны true

        boolean b6 = false && true;
        System.out.println("false && true: " + b6);
        // b6 = (2 > 5) && (11 == 11);
        boolean b10 = false && false;
        System.out.println("false && false: " + b10);
        boolean b11 = true && false;
        System.out.println("true && false: " + b11);
        boolean b9 = true && true;
        System.out.println("true && true: " + b9);

        int a = 10;
        int b = 0;

        // При использовании логическое И - &, то просчтитываются обе стороны уравнения и (b != 0) и (a / b > 0)
        // boolean b7 =(b != 0) & (a / b > 0);

        // При использовании Логическое сокращенное ИИ - && -, то просчтитываются только одна левая сторона уравнения (b != 0)
        // Правая сторона (a / b > 0) игнораруется
        boolean b7 =(b != 0) && (a / b > 0);
        System.out.println("boolean b7 =(b != 0) & (a / b > 0): " + b7);


        System.out.println("_______ Логическое сокращенное ИЛИ ИЛИ - || - __________");
        // Выдает true || false если хотя бы одна часть выражения равна true

        // При использовании логическое ИЛИ - | -, то просчтитываются обе стороны уравнения и (b != 0) и (a / b > 0)
        // boolean b7 =(b != 0) & (a / b > 0);

        // При использовании Логическое сокращенное ИЛИ ИЛИ - || -, то просчтитываются только одна левая сторона уравнения (b != 0)
        // Правая сторона (a / b > 0) игнораруется
        boolean b8 = true || (a / b > 0);
        System.out.println("true || (a / b > 0: " + b8);

        System.out.println("========================================================================");

        System.out.println("_____ Приоритетная шкала для знаков для вычисления () -> ! -> & -> ^ -> | -> && -> || _______");

        System.out.println("true ^ true & false: " + (true ^ true & false));// результат true
        System.out.println("Спера просчитывается операция true & false: " + (true & false));// результат false (true ^ true)
        System.out.println("Второй шаг true ^ true: " + (true ^ false)); // результат true
        System.out.println("Конечный результат: " + true);

        System.out.println();

        System.out.println("true ^ true && false: " + (true ^ true && false));// результат false
        System.out.println("Спера просчитывается операция - true ^ true: " + (true ^ true));// результат false (true ^ true)
        System.out.println("Второй шаг - true && true: " + (false && false)); // результат folse
        System.out.println("Конечный результат: " + (false));

        System.out.println("____ ");

        System.out.println("(true ^ true) & false: " + ((true ^ true) & false));// результат false
        System.out.println("Спера просчитывается операция - true ^ true: " + (true ^ true));// результат false (true ^ true)
        System.out.println("Второй шаг - true && true: " + (false & false)); // результат folse
        System.out.println("Конечный результат: " + (false));

        System.out.println("+++++++++++++++++++");

        System.out.println("_____ Приоритетная шкала для знаков для вычисления () -> ! -> & -> ^ -> | -> && -> || _______");

        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int qq = 2;
        System.out.println(aa | bb | cc < 100 & !aa ^ qq == 5);
        // 1 шаг: qq == 5 -> 2 == 5 -> false
        System.out.println(aa | bb | cc < 100 & !aa ^ false);
        // 2 шаг: cc < 100 -> 25 < 100 -> true
        System.out.println(aa | bb | true & !aa ^ false);
        // 3 шаг: true & !aa -> true & false -> false
        System.out.println(aa | bb | false ^ false);
        // 4 шаг: false ^ false = fols
        System.out.println(aa | bb | false);
        // 5 шаг: aa | bb = true
        System.out.println(true | false);
        // 6 шаг: true | true = true
        System.out.println(true);// Конечный результат - true







    }
}
