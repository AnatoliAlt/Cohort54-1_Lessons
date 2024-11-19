package lesson_19__14_11_24.homework19;
/*                              Home Work 19
                                   Task 1
                             Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять
базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:
Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
 */
public class HW19_T1_Calculator {

    // Константа PI
    public static final double PI = 3.141519;


    // Длина окружности
    public static double circumference(double radius){
        return 2 * PI * radius;
    }
    // Площади круга
    public static double areaOfACircle(double radius){
        return PI * radius * radius;
    }



    // Сложение
    public static int plus(int a, int b){
        return a + b;
    }
    // Вычитение
    public static int minus(int a, int b){
        return a - b;
    }
    // Умножение
    public static int multiply(int a, int b){
        return a * b;
    }
    // Деление
    public static int division(int a, int b){
        return a / b;
    }


}
