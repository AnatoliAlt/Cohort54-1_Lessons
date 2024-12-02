package lesson18__12_11_24_Modification_Static_Infiniti.homework18;

import lesson19__14_11_24.homework19.HW19_T2_ImmutablePoint;

public class NewCalculatorApp {
    public static void main(String[] args) {

        // Ctrl + (буква) В (курсор на название метода)
        double sum = HW19_T2_ImmutablePoint.NewCalculator.add(1, 10);
        double sum1 = HW19_T2_ImmutablePoint.NewCalculator.subtract(1, 10);
        double sum2 = HW19_T2_ImmutablePoint.NewCalculator.multiply(1, 10);
        int sum3 = HW19_T2_ImmutablePoint.NewCalculator.divide(1, 0);

        System.out.println("Сложение: " + sum);
        System.out.println("Вычитение: " + sum1);
        System.out.println("Умножение: " + sum2);
        System.out.println("Деление: " + sum3);

        System.out.println("-------- Деление double на ноль ---------");

        //Деление на ноль простых целочисленых не возможно
        int a = 10;
        int b = 0;
        // System.out.println(a / b);

        double result;
        double x = 10.0;
        result = x / 0;
        // Infinity - БЕСКОНЕЧНО большое число
        System.out.println("result: " + result);// Результат: Infinity - БЕСКОНЕЧНОСТЬ

        double infinity = 1999 / 0.0;
        System.out.println("infinity: " + infinity);

        System.out.println(infinity > result);// Результат: false
        System.out.println(infinity == result);// Результат: true
        System.out.println(infinity / result);// Результат: NaN - Not and Nambers - Значение не определенно
        System.out.println(1 / infinity);// Результат: 0.0
        System.out.println(infinity + 1555000);// Результат: Infinity
        System.out.println(infinity - 1000);// Результат: Infinity
        System.out.println(infinity - result);// Результат: NaN - Not and Nambers - Значение не определенно

        double minusInfiniti = -1999 / 0.0;
        System.out.println("minusInfiniti: " + minusInfiniti);// Результат: -Infinity
        System.out.println(infinity > minusInfiniti);// Результат: NaN - Not and Nambers - Значение не определенно

        // 1 -> 1.0
        double res1 = (double) 1 / 5;// Явное (приведение) присвоение типов int в double. 0 -> 0.2
        System.out.println("res1: " + res1);// Результат: res1: 0.2

        int res2 = (int) (1.0 / 5);// 0.2
        System.out.println("res2: " + res2);


    }
}
