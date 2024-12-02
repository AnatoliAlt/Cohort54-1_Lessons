package lesson14__29_10_24_GitIDE_ClassArray_StringBuilder.homework14;
/*                           Home Work 14
                                Task 2
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел.
 */
public class HW_Task2 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 7, 6, 5, 8};
        int maxNum = 0;
        int secondMaxNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum){
                secondMaxNum = maxNum;
                maxNum = array[i];
            }else if (array[i] > secondMaxNum && array[i] < maxNum){
                secondMaxNum = array[i];

            }

        }
        System.out.println("Максимальный элемент массива: " + maxNum);
        System.out.println("Второй максимальный элемент массива: " + secondMaxNum);
    }

}
