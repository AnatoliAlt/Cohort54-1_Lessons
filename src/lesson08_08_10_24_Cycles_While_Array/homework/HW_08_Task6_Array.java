package lesson08_08_10_24_Cycles_While_Array.homework;
/*                                  Home Work 8
                                      Task 6
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */

import java.util.Random;

public class HW_08_Task6_Array {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[5];// Инициализируе массив и бронирунм количество ячеек памяти
        int lenght = array.length; // Проверяем длину массива
        System.out.println("Длина строки: " + lenght);
        String arrayToStrings = "[";
        int i = 0;
        while (i < array.length) {
            array[i] = random.nextInt(101) - 50;
            arrayToStrings += array[i];

            if (i != array.length - 1) {
                arrayToStrings += "|";
            } else {
                arrayToStrings += "]";
            }
            i++;
        }
        System.out.println("Array: " + arrayToStrings);
        System.out.println();
        System.out.println("===== Минимальное значение =====");
        i = 0;
        int min = array[0];
        while (i < array.length) {
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }
        System.out.println("Минимальное значение = " + min);
        System.out.println();
        System.out.println("==== Максимальное значение =====");
        i = 0;
        int max = array[0];
        while (i < array.length){
           if (array[i] > max){
               max = array[i];
           }
            i++;
        }
        System.out.println("Максимальное значение = " + max);
        System.out.println("========== Среднее арифметическое всех значений в массиве ========== ");
        i = 0;
        int sum = 0;
        while (i < array.length){
            sum += array[i];
            i++;
        }
        System.out.println("Общее арифметическое массива: " + sum);
        int res = sum / 2;
        System.out.println("Среднее арифметическое массива: " + res);
    }

}
