package lesson10_15_10_24_Return_fori_continue_break.classwork_loopFori;

import java.util.Random;

public class MethodsWithReturn {
    public static void main(String[] args) {
        System.out.println("----------------------------- 1 -----------");
        int a = 10;
        int b = 5;

        int sum = a + b;
        System.out.println("sum: " + sum);

        int result = calculeSum(10, 20);
        System.out.println("result: " + result);
        System.out.println(calculeSum(3, 7));
        System.out.println("______________________________");

        System.out.println("----------------------------- 2 ------------");
        // Написать метод возвращающий квадрат числа
        double square = squareNumber(2.5);
        System.out.println("square: " + square);

        System.out.println(squareNumber(4.0));
        System.out.println("squareNumber (4.0): " + squareNumber(4.0));
        System.out.println("squareNumber (5): " + squareNumber(5));
        System.out.println("_________________________________________");

        System.out.println("------------------------- 3 --------------------");
        // CONCATENATION - конкатенируем String и int
        String res = concatString("Java ", 17);
        System.out.println(res);
        System.out.println("------------------------------------------");
        System.out.println("------------------------- 4 --------------------");
        // Метод, который возвращает массив интов int на 10 элементов, заполненный случайными значениями
        // Заполнение массива
        int[] ints = fillArray();
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + (i != ints.length - 1 ? ", " : "]\n"));

        }
        System.out.println("------------------------------------------");

    }
    //System.out.println("------------------------- 4 --------------------");
    // Метод, который возвращает массив интов int на 10 элементов, заполненный случайными значениями
    public static int[] fillArray() {
        int[] result = new int[10];      // Длина строки массива
        System.out.println("Длина строки - " + result.length);
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {

            result[i] = random.nextInt(); // В каком диапазоне чисел должен быть массив
            //  result[i] = random.nextInt(); [1430151725, 550943175, 1827388311, 1007691372, -1507913865, 866446741, -1655900915, 2134634526, -1550723147, 1768112353]
            // или result[i] = random.nextInt(10); то диапазон чисел от 0 до 10
        }
        return result;
        //System.out.println("------------------------------------------");
    }
    // System.out.println("------------------------- 3 --------------------");
    public static String concatString(String str, int x) {
        String reulr = str + x + "!!!";
        return reulr;
        //System.out.println("------------------------------------------");
    }

    // System.out.println("------------------------- 2 --------------------");
    // Написать метод возвращающий квадрат числа
    public static double squareNumber(double number) {
        return number * number;
        //System.out.println("------------------------------------------");
    }

    //System.out.println("---------------------- 1 ---------");
    public static int calculeSum(int a, int b) {

        int sum = a + b;
        //System.out.println(sum);
        return sum;
        //System.out.println("_______________________________________");
    }

}
