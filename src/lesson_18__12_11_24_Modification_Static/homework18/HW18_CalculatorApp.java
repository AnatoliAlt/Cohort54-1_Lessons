package lesson_18__12_11_24_Modification_Static.homework18;

public class HW18_CalculatorApp {
    public static void main(String[] args) {

        HW18_Calculator calculator;
        calculator = new HW18_Calculator();

        System.out.println("Сложение: " + HW18_Calculator.plus(5,5));
        System.out.println("Вычитание: " + HW18_Calculator.minus(5,5));
        System.out.println("Умножение: " + HW18_Calculator.multiplication(5,5));
        System.out.println("Деление: " + HW18_Calculator.division(5,5));
        System.out.println();
        System.out.println("a = " + calculator.getA());
        System.out.println("b = " + calculator.getB());
        System.out.println("Сложение: ");
        System.out.println(calculator.getA() + calculator.getB());
        System.out.println("Вычитание:");
        System.out.println(calculator.getA() - calculator.getB());
        System.out.println("Умножение: " + calculator.getA() * calculator.getB());
        System.out.println("Деление: " + calculator.getA() / calculator.getB());

    }
}
/*
 // Сложение
    public static int plus(int a, int b){
        return a + b;
    }
    // Вычитание
    public static int minus(int a, int b){
        return a - b;
    }
    // Умножение
    public static int multiplication(int a, int b){
        return a * b;
    }
    // Деление
    public static int division(int a, int b){
        return a / b;
    }
 */
