package lesson_03_peremennie_tipydannih.homework_03;
/*
Task 2
Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4. Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
Выведите на экран значение переменной.
Какой остаток от деления программа "потеряла"?
 */

public class HW_Task_2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;

        int res = (a + b + c + d) / 4;
        System.out.println("Sum of values (a + b + c + d) / 4 = " + res);// Сумма значений

        // Программа потеряла остаток  от деления "2"
        int remainder = (a + b + c + d) % 4;// остаток
        System.out.println("Remainder of division (a + b + c + d) % 4 = " + remainder);// Остаток деления
    }
}
