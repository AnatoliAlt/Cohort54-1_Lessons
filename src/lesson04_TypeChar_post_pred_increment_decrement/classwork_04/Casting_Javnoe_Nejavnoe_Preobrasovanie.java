package lesson04_TypeChar_post_pred_increment_decrement.classwork_04;

public class Casting_Javnoe_Nejavnoe_Preobrasovanie {
    public static void main(String[] args) {
        /*
        TODO Кастинг:  Два способа преоброзования типов данных: Явное и неявное преоброзование
        1. Неявное преоброзование (автомотическое)
        2. Явное преоброзование

        - Неявное преоброзование происходит  автомотически
        когда значение меньшего типа данных преобразуется в больший тип данных
        */

        // Безопасный тип преобразования - это преобразование из меньшего типа в больший

        byte byteVar = 123; // -128 ... 127

        int intVal;
        intVal = byteVar;   // Неявное преобразование типа byte в тип int

        double doubleVar = intVal;     // Неявное преобразование int в double
        System.out.println(intVal);
        System.out.println(doubleVar);

        // double test = 9_000_000_000_000_000_000_000_000_000.0;

        /*
        - Явное, когда нужно преобразовать значение большего типа данных в значение меньше
        Небезопасное преоброзование, может привести к потери данных.
         */

        // Явное преобразование double в int

        double double1 = 42.9;
        int int1 = ( int ) double1;// Явное преобразование double в int

        System.out.println("double1: " + double1);
        System.out.println("int1: " + int1);

        // Преобразование в вычислениях

        int x = 20;
        int y = 7;

        double result;

        // 20 / 7 = 2 (int)
        result = x / y;
        System.out.println("result: " + result);

        result = x / 7.0;

        /* Когда в выражении (в формуле) присутствует несколько типов данных, то все значения в
        выражении автоматически преобрадзуются к самому большому типу.
        Если в выражениях есть хотя бы одно значение с плавающей точкой ( float / double), то все
        целочисленные типы в этом выражении кастируются к типу double.
        */

        System.out.printf("result: %.2f\n" , result);
        System.out.println("result double: " + result);


        // 20.0f / 7.0f -> 2.85 double
        result = (float) x / y; // Будет произведено обычное деление ( не целочисленное )
        /*
        (float) x - в этом выражении мы преобразуем ""х" во (float) и в таком
        случае ""y" преобразуется автоматически во (float).
         */
        System.out.println("result float: " + result);

        // ИЛИ

        // 20 -> 20.0 / 7.0 = 2.85 (double) -> 2.85 (double)
        result = x / (double) y;
        System.out.println("result: " + result);


    }
}
