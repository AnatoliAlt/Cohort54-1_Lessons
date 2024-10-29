package lesson_11__17_10_24_Null__Continue_01_43.classwork_fromTheTeacher_HW10;

import java.util.Arrays;

/*               Занятие 11 (разбор дом задания 10) Home Work10
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
public class HW10_Task1_FromTheTeacher {
    public static void main(String[] args) {
        // [0, 1, 2, 3, 4, 5, 6]
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};

        int[] numbers2 = {0, 1, 2, 3};


        copyOfArray(numbers, 10);
        copyOfArray(numbers, 3);
    }

    public static void copyOfArray(int[] array, int newLenght) {

        // Как проверить и остановить ошибку null в методе
        if (array == null){
            return; // 01:15 с помощью return можно прекратить работу метода
        }
        //            {0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}

        // int[] array - Входящий массив
        // [int newLenght] - Длина массива (например - [3])
        //[0, 0, 0, 0, 0] - при создании массива -> массив по умолчанию заполняется ноликами

        int[] result = new int[newLenght];
        int length = result.length;
        System.out.println("Длиеа массива: " + length + " элементов");
        /*
        - Числовые типы (в том числе char) -> 0 / 0.0
        boolean -> false
        ссылочные типы данных (в том числе String) -> null
         */
        System.out.println("Длина изначального массива: " + array.length);
        System.out.println("Длина result массива: " + result.length);
        // Цикл закончим свою работу как только i выйдет за границы любого издвух массивов
        for (int i = 0; i < array.length && i < result.length; i++) {//Перебираем индексы меньшего по длине массива
            result[i] = array[i];

        }
        printArray(result);
        // или другой способ распечатать массид
        // МЕТОД ВОЗВРАЩАЕТ СТРОКОВОЕ ПРЕДСТАВЛЕНИЕ МАССИВА

        //String arrayStr = Arrays.toString(result);
        //System.out.println(arrayStr);
        System.out.println("\nРаспечатать массив: " + Arrays.toString(result));
    }

    public static void printArray(int[] array) {
        //            {0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
