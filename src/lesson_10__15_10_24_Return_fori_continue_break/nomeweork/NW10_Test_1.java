package lesson_10__15_10_24_Return_fori_continue_break.nomeweork;

import java.util.Arrays;

/*
Task 1
Написать метод со следующим функционалом:
На вход метод принимает массив целых чисел и число - длину нового массива. Метод должен
создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы
элементы из входящего массива:
{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Copy
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Copy
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */
public class NW10_Test_1 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
        copiOfArray(numbers, 10);
    }

    public static void copiOfArray(int[] array, int newLeght) {
        // 0, 0, 0 ,0, 0
        int[] result = new int[newLeght];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];

        }
        //printArray(result);
        String arrayStr = Arrays.toString(result);
        System.out.println(arrayStr);
        System.out.println("\n------------------------\n");
        System.out.println(Arrays.toString(result));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ", ");
        }
    }
}
