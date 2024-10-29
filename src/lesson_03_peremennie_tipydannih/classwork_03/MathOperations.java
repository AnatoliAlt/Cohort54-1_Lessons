package lesson_03_peremennie_tipydannih.classwork_03;

public class MathOperations {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;
        int result;

        result = var1 + var2;
        System.out.println(" var1 + var2 = " + result);

        // Прибавление
        result = 15 + 6 + var1;
        System.out.println("result: " + result);

        // Вычитание "-"

        result = var1 - var2;
        System.out.println("var1 - var2 = " + result);

        // Умножение "*"
        result = var1 * var2;
        System.out.println("var1 * var2 = " + result);

// Целочисленное деление "/"
        result = var1 / var2;
        // 20 / 7 -> 2 целые и в остатке 6
        System.out.println("var1 / var2 = " + result);

        // Остаток от деления "%"
        result = var1 % var2;
        System.out.println("var1 % var2 = " + result);

        System.out.println("Целочисленное деление 4 / 2: " + (4 / 2));// 2
        System.out.println("Остаток от деления 4 % 2: " + (4 % 2));// 0

        System.out.println("5 / 10 = " + (5 / 10));// 0
        System.out.println("5 % 10 = " + (5 % 10));// 5

        System.out.println("=================\n");

        result = 2 + 10 / 2;//
        /* Приоритет математических операций
        1. Сначала выполняется умножение, деление, остаток от деления.
        2. В последнюю очередь выполняется сложение, вычитание.
        */
        System.out.println(" 2 + 10 / 2 = " + result);// 7

        result = (2 + 10) / 2;
        System.out.println("(2 + 10) / 2 = " + result);// 6

        System.out.println("========================");

        double x = 20.0d;// d - явно указать, что число записанно в формате double
        double y = 7.0;// все числа, записанные в нашем коде с "." считаются числами в формате double

        // Деление "/"
        double resultDouble = x / y;
        System.out.println("resultDouble = " + resultDouble);

        int a = 20;
        int b = 7;
        int res = 20 / 7;
        System.out.println("Результат деления " + a + " на " + b + " равен " + res);
        // или
        /*
        %d - целое число
        %s - текст
        %f - число с плавающей точкой
        %n - символ новой строки
        \n - символ новой строки
         */

        // Форма.тированный вывод. Мы используем шаблон вывода и список значений, которые будут подставлены в этот шаблон
        System.out.printf("Результат деления %d на %d равен = %d\n", a, b, res);
        System.out.println("Test");
        System.out.println("Результат деления 20 на 7 равен = 2");

        System.out.printf("Округленный вывод результата деления %f\n ", resultDouble);
        // %.2f - .2 используется для обозначения количества цифр после запятой
        // resultDouble = 2.857142857142857 - оригинальное значение
        // "Округленный вывод результата деления %f\n " - 2,857143
        // "Округленный вывод результата деления %.3f\n " - 2,857
        // "Округленный вывод результата деления %.2f\n ", resultDouble" - 2,86
        System.out.printf("Округленный вывод результата деления %.3f\n ", resultDouble);

        System.out.println("==========================");

        // Проблема с double
        double x1 = 0.1;
        double y1 = 0.2;
        double z = x1 + y1;// 0.3
        System.out.println("0.1 + 0.2 = " + z);

        x1 = 1.0;
        y1 = 4.0;
        z = x1 / y1;// 0.25
        System.out.println("z: " + z);


    }
}
