package lesson_19__14_11_24.homework19;

public class HW19_T1_2_CalculatorApp {
    public static void main(String[] args) {

        int radius = 3;

        double circumference = HW19_T1_Calculator.circumference(radius);// Длина окружности
        System.out.printf("Длина окружности: %.2f\n", circumference);

        double circle = HW19_T1_Calculator.areaOfACircle(radius); // Площадь круга
        System.out.printf("Площадь круга: %.2f\n", circle);
        System.out.println();
        // Ctrl + (буква) В (курсор на название метода)
        double sum = HW19_T1_Calculator.plus(1, 10); // Сложение
        double sum1 = HW19_T1_Calculator.minus(1, 10); // Вычитение
        double sum2 = HW19_T1_Calculator.multiply(1, 10); // Умножение
        int sum3 = HW19_T1_Calculator.division(1, 10); // Деление


        System.out.println("Сложение: " + sum);
        System.out.println("Вычитение: " + sum1);
        System.out.println("Умножение: " + sum2);
        System.out.println("Деление: " + sum3);


    }
}
