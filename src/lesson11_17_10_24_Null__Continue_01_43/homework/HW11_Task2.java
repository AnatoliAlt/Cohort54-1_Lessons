package lesson11_17_10_24_Null__Continue_01_43.homework;
/*                               Home Work 11
                                     Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW11_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 5 до 10 ");
        System.out.println("<---------------------------------------------------->");

        int res = scanner.nextInt();
        System.out.print("Введенное число: ");
        scanner.nextLine();
        System.out.print(res >= 5 && res <= 10 ? res : "Вы ввели неверное число!\n");
        System.out.println("\n<-------------------------------------------------->");
        if (res >= 5 && res <= 10) {  // <- ЭТОТ КОД ПОДСКАЗАЛ ИИ
            intArray(res);
            // Полученное число передаем в Random для генерации длины массива случайными числами
        }

    }

    public static void intArray(int res) {
        Random random = new Random();
        int[] sum = new int[res];
        int lenght = sum.length;
        System.out.println("\nArray lenght " + lenght + " of the Elements (Длина массива ... элементов).");


        System.out.print("Array: [");
        for (int i = 0; i < sum.length; i++) {

            sum[i] = random.nextInt(10) + 1;// Случайные числа Random в диапазоне от 1 до 10 ; без - 0
            System.out.print(sum[i] + (i != sum.length - 1 ? ", " : "]\n"));

        }
        System.out.println("\n<----------------------------------------------------------->\n");
        sumArray(sum);// Выводим на экран общую сумму всех элементов массива
        System.out.println("\n<------------------------------------------------------------->\n");
        System.out.println("\nРаспечатать массив: " + Arrays.toString(sum));
        System.out.println("\n<---------------------------------------------------------------->");
        arithmeticMeanSum(sum);// Выводим на экран среджне арифметическое значение всех элементов массива
        System.out.println("\n<-------------------------------------------------------------->");
    }

    // Написать метод, который считает сумму всех элементов в массиве.
    public static void sumArray(int[] array) {
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];

        }
        System.out.print("Summe of all elements of the array (cумма всех элементов массива): " + summe);

    }

    //Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
    public static void arithmeticMeanSum(int[] array) {
        double sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];

        }
        double res = sumArray / 2;
        System.out.println("Среднее арифметическое значение массива: " + res);
    }


}
