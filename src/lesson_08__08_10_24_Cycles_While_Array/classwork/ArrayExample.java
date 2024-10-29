package lesson_08__08_10_24_Cycles_While_Array.classwork;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array; // Объявление массива типа int
        String[] strings; // Объявление массива типа  String

        int array1[]; // ---- Аальтернативный способ объявления массива. Не рекомендуется  использовать -----


        array = new int[4]; // Создание массива (инициалидзация массива типа int с 4 ячейками
        strings = new String[10]; // Создание массива (инициалидзация массива строк с 10 ячейками

        int[] array2 = new int[8]; // Объявление и инициализация массива int на 8 ячеек

        /*
                Значения по умолчанию:
                1. Для всех числовых типов (в том числе char) это будет 0 (0.0)
                2. Для boolean - false
                3. Для всех ссылочных типов - null (null - ничего)
         */

        boolean[] bools = new boolean[4];
        System.out.println("bools[3]: " + bools[3]); // false

        // Обращение к элементу массива по индексу (номеру ячейки)
        int value = array2[0];
        System.out.println("array2[0]: " + value); // 0
        System.out.println("string[2]: " + strings[2]); // null

        System.out.println("=====================================================");

        int[] numbers = new int[]{45, 56, -16, 45, 0, 159, 1444};//   Явная инициализация массива

        int length = numbers.length; // Узнать длину массива (количество ячеек / элементов массива)
        System.out.println("length (Длина массива): " + length + " элементов"); // Длина массива: 7 элементов - {45, 56, -16, 45, 0, 159, 1444}

        // Еще один способ Явной инициализации массива
        int[] ints = {-10, 54, 32323, 444};

        System.out.println("В 0 ячейке массива numbers находится число: " + numbers[0]);
        System.out.println("В 2 ячейке массива ints находится число: " + ints[2]);
        System.out.println("В 9 ячейке массива strings находится число: " + strings[9]);

        System.out.println(ints); // Получим визуализированную ссылку на адрес в памяти (Heap) находится наш массив

        System.out.println("========= Распечатываем массив ints ====================");
        System.out.println("Распечатываем массив ints: ");

        int i = 0;
        while (i < ints.length) {
            System.out.print(ints[i] + ", ");
            i++;
        }
        System.out.println();

        System.out.println("====== Распичатываем массив красиво ==========");
        System.out.println(" Убрать запятую после последнего элемента в массиве");

        // [1, 3, 5, 6, 7]
        String arrayToString = "[";
        i = 0;
        while (i < numbers.length) {
            arrayToString += numbers[i];
            // arrayToString += ", "; // [45, 56, -16, 45, 0, 159, 1444, ] что бы убрать запятую после последнего элемента, то
            //используем if

            if (i != numbers.length - 1) {
                arrayToString += ", ";
            } else {
                arrayToString += "]";
            }
            i++;
        }
        //arrayToString += "]";
        System.out.println("numbers2: " + arrayToString);

        System.out.println("======== Присвоение значений элемента массива =============");
        int[] numbers2 = new int[10];

        numbers2[2] = 10;// Присвоение нового значения 10 элементу массива с индексом 2
        System.out.println("numbers2[2]: " + numbers2[2]);

        System.out.println("================= Random ========================");

        // Заполнить массив случайными числами в диапазоне от 0 до 100
        Random random = new Random();

        int k = 0;
        System.out.print("[");
        while (k < numbers2.length){
            numbers2[k] = random.nextInt(101);
            System.out.print(numbers2[k] + ",");
            k++;
        }
        System.out.println("]\n");

        System.out.println("===== Поиск минимального значения в массиве ================");

        i = 0;
        int min = numbers2[0];
        while (i < numbers2.length){
            if (numbers2[i] < min){
                min = numbers2[i];
            }
            i++;
        }
        System.out.println("Минимальное значение в массиве: " + min);

    }
}
