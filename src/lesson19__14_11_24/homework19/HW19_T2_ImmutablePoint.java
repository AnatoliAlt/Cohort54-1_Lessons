package lesson19__14_11_24.homework19;
/*                              Home Work 19
                                   Task 2
Неизменяемая переменная
•	Объявите переменную final int MAX_USERS = 100;.
•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
•	Объясните, что произошло при попытке изменения значения.
 */

public class HW19_T2_ImmutablePoint {

    public static void main(String[] args) {


        final int MAX_USERS = 100;// Примитивные типы данных
        // После инициализации (присвоения первого значения) - изменить значения в переменной нельзя
        // Результат:
        //C:\Users\
        //
        //Process finished with exit code 0
    }

    /*                              Home Work 18
                                           Task 1
        Класс "Калькулятор"
        Создайте класс Calculator, который будет предоставлять
        базовые арифметические операции: сложение, вычитание, умножение и деление
        Класс должен содержать:
        Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
         */
    public static class NewCalculator {
        // Сложение
        public static double add(int a, int b) {
            return a + b;
        }

        // Вычитение
        public static double subtract(int a, int b) {
            return a - b;
        }

        // Умножение
        public static double multiply(int a, int b) {
            return a * b;
        }

        // Деление
        public static double divide(double a, double b) {
            System.out.println("double division: ");
            return a / b;
        }

        public static int divide(int a, int b) {
            System.out.println("int division: ");
            if (b == 0) {
                // TODO хорошего решения нет.
                return Integer.MAX_VALUE;
            }
            return a / b;
        }


    }
}
