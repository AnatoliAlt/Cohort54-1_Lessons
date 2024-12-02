package lesson18__12_11_24_Modification_Static_Infiniti.homework18;

public class NewCalculator {

    public static int plus(int a, int b){
        return a + b;
    }
    // Вычитение
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

    public static void main(String[] args) {
        System.out.println("Сложение: " + plus(6,5));
        System.out.println("Вычитание: " + minus(6,5));
        System.out.println("Умножение: " + multiplication(5,5));
        System.out.println("Деление: " + division(5,5));
    }

}
