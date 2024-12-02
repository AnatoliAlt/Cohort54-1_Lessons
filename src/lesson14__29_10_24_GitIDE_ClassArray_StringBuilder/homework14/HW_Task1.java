package lesson14__29_10_24_GitIDE_ClassArray_StringBuilder.homework14;
/*                         Home Work 14
                              Task 1
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
 */
public class HW_Task1 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                sum += array[i];

            }

        }
        System.out.print("Сумма всех четных чисел в массиве: " + sum);
    }
}
