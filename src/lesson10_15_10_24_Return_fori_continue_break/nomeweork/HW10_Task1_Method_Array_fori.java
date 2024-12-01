package lesson10_15_10_24_Return_fori_continue_break.nomeweork;

import java.util.Arrays;
import java.util.Random;

/*                                    Home Work 10
                                          Task 1
Написать метод со следующим функционалом:
На вход метод принимает массив целых чисел и число - длину нового массива. Метод должен
создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть
скопированы элементы из входящего массива:
{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Copy
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Copy
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */
public class HW10_Task1_Method_Array_fori {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print("Array: [");
        int[] result = new int[5];// Массив на 10 элементов
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(11) - 5;// Случайные числа Random
            System.out.print(result[i] + (i != result.length - 1 ? ", " : "]\n"));

            //int[] neuResult = new int[3];// Колтчество элементов нового массива

        }
        copyOfArray(result, 10);
    }

    public static void copyOfArray(int[] resAr, int newResult) {
        // int[] resAr - Входящий массив
        // [int newResult] - Длина массива (например - [3])

        int[] newArr = new int[newResult];
        for (int i = 0; i < resAr.length; i++) {
            newArr[i] = resAr[i];

        }
        printArray(newArr);
        // или другой способ распечатать массив
        // МЕТОД ВОЗВРАЩАЕТ СТРОКОВОЕ ПРЕДСТАВЛЕНИЕ МАССИВА
        //String arrayastr = Arrays.toString(newArr);
        //System.out.print(arrayastr);
        System.out.print("\nРаспечатать массив: " + Arrays.toString(newArr));

    }

    public static void printArray(int[] array) {
        System.out.print("New Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length -1 ? ", " : "]"));
        }
    }
}
