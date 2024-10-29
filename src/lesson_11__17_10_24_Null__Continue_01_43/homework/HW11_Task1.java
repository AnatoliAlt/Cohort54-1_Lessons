package lesson_11__17_10_24_Null__Continue_01_43.homework;

import java.util.Random;

/*                        Home Work 11
                            Task 1
Написать метод, который считает сумму всех элементов в массиве.


 */
public class HW11_Task1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] result = new int[random.nextInt(10)];// Объявляем массив длиной [...]

        int lenght = result.length;// Выводим на кансоль длину массива
        System.out.println("Array lenght: " + lenght + " of the Elements.");// Длина массива ... элементов.

        System.out.print("Array numbers: [");// Выводим на каисоль все элементы массива с помощью тернарного оператора
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(10) - 5;// Случайные числа Random в диапазоне от 0 до 10
            System.out.print(result[i] + (i != result.length - 1 ? ", " : "]\n"));
        }
        sumElemets(result);
    }

    public static void sumElemets(int[] array) {
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];


        }
        System.out.println("Summe of all elements of the array (cумма всех элементов массива): " + summe);// "Cумма всех элементов массива: "

    }
}
