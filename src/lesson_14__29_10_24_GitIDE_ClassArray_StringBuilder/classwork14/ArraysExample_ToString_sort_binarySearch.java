package lesson_14__29_10_24_GitIDE_ClassArray_StringBuilder.classwork14;

import java.util.Arrays;
import java.util.Random;

public class ArraysExample_ToString_sort_binarySearch {
    public static void main(String[] args) {

        int[] array = {3, 2, 1, 0};

        // У нас есть метод который возвращает нам строковое представленте масства
        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);

        System.out.println(Arrays.toString(array));

        // /-------------------------------------------------------------------/

        // Сортирует указанный массив в обратном порядке - [0, 1, 2, 3] в порядке возрастания
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        // /-----------------------------------------------------------------------/


        // binarySearch - Бинарный поиск (массив должен быть отсортирован)
        // Возвращает индекс элемента массива. Если индекс не найден - возвращает отрицательное значение
        int index = Arrays.binarySearch(array, 3);// array - где ищем, 3 - что ищем

        System.out.println("index: " + index);

        // /-----------------------------------------------------------------/

        //           [0, 1, 2, 3]
        // Метод проверяет равны ли два массива по значениям
        // Массивы будут равными true только в случае если array = {0, 1, 2, 3} = test = {0, 1, 3, 2}
        // В случае если значения стоят в разном порядке то массивы будут не равными false array = {0, 1, 2, 3} != test = {0, 1, 3, 2}

        int[] test = {0, 1, 3, 2};

        // int[] array = {0, 1, 2, 3};
        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println("isArraysEquals: " + isArraysEquals);//  isArraysEquals: false

        // /------------------------------------------------------------/

        // Метод находит и возвращает индекс первого различия между массивами
        // // [0, 1, 2, 3]
        // [0, 1, 2, 3]
        //
        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println("mismatchIndex: " + mismatchIndex);// Результат:  mismatchIndex: 2 (первое различие начинается во втором индексе)

        // /----------------------------------------------------------------/

        // Многомерные массивы

        int[][] arrayD = new int[6][5];
        // System.out.println(arrayD);// Результат: [[I@6d311334. С обычным System.out.println работать не будет
        // Arrays.toString() - нужен для печати массивов
        System.out.println(Arrays.toString(arrayD));// Результат: тоже не работает

        // Возвращает строковое представление многомерных массивов (включая вложенные массивы)
        System.out.println(Arrays.deepToString(arrayD));// Результат: [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

        // /----------------------------------------------------------------/

        // Метод для сравнения по значению многомерных массивов          02:30:
        int[][] arrayC = new int[6][5];
        System.out.println(Arrays.equals(arrayC, arrayD));// Результат: false - не может их сравнивать
        System.out.println(Arrays.deepEquals(arrayC, arrayD));// Результат: true - умеет сравнивать
        arrayC[2][3] = 1;// Изменяем один элемент
        System.out.println(Arrays.deepToString(arrayC));// Результат: false - не может их сравнивать. массивы не равны из-за = 1

        // /-----------------------------------------------------------------/
        // 02:34:30
        // Перебрать все значнгия одномерного массива
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");

        }
        System.out.println();
        // /-------------------------------------------------------------------/

        // 02:35:30

        // Перебрать все значения многомерного массива

        for (int i = 0; i < arrayC.length; i++) {
            for (int j = 0; j < arrayC[i].length; j++) {
                System.out.print(arrayC[i][j] + ", ");

            }
            System.out.println();
        }
        System.out.println("\n ======================================================= \n");

        // 02:40:

        // copyOf - Метод копирует массив [0, 1, 3, 2] или его часть в новый массив
        // При длине нового массива 10, оставшиеся ячейки заполняются ноликами
        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copyOfTest));// Результат: [0, 1, 3, 2, 0, 0, 0, 0, 0, 0]

// Вторая ситуация
        int[] copyOfTest2 = Arrays.copyOf(test, 2);
        System.out.println(Arrays.toString(copyOfTest2));// Результат: [0, 1]

        // / --------------------------------------------------------------- /

        // 02:46:

        // Метод заполнения массива значениями 10  Arrays.fill(arr, 10);

        int[] arr = new int[5];

        // Заполнение всех ячеек массива
        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr));// Результат: [10, 10, 10, 10, 10]

        // часть массива от стартового индекса (включительно) и до конечного (не включительно)

        Arrays.fill(arr, 1, 4, 1000);
        System.out.println(Arrays.toString(arr));// Результат: [10, 1000, 1000, 1000, 10]

        // Пример с другими значениями
        Arrays.fill(arr, 0, 4, 1000);
        System.out.println(Arrays.toString(arr));// Результат: [1000, 1000, 1000, 1000, 10]

        // /----------------------------------------------------------------/

        // / -----------  02:49:35 ------------------------------------/

        System.out.println("\n ------------- Random ------------------ \n");
        // Генерируется только одно случайное значение и им заполняется весь массив
        Random random = new Random();
        Arrays.fill(arr, random.nextInt(1000));
        System.out.println(Arrays.toString(arr));// Результат: [102, 102, 102, 102, 102]

        // /--------------------------------------------------------------/

        // / -------------------- 02:50:40 ------------------------------/

        // Очень гибкий инструмент для копирования массива или части массива в другой массив

        // Берем значения с  int[] arr = new int[5];
        int[] copy = new int[10];
        System.arraycopy(arr, 1, copy, 3, 2);
        System.out.println(Arrays.toString(copy));// Результат: [0, 0, 0, 287, 287, 0, 0, 0, 0, 0]

        int[] arr1 = {0, 1, 2, 3, 4};
        // Другой пример, берем значения с  int[] arr1 = {0, 1, 2, 3, 4};
        System.arraycopy(arr1, 1, copy, 3, 2);
        System.out.println(Arrays.toString(copy));// Результат: [0, 0, 0, 1, 2, 0, 0, 0, 0, 0]


        // /----- Подсказки для дом задания Home Work 14 --------------/

        //                           Task 2



        //                           Task 3

        // Например: Создаем строку с гласными буквами
        String vomels = "aeiouAEIOU"; // (Здесь все гласные буквы английского алфавита. Их всего 5 штук)
        // Проверяем содержатся в строке согласные буквы с помощью indexOf или contans

        // Второй вариант
        // Отделяет буевы от знаков пунктуации
        // Показывае true если символ буква и false если символ знак пунктуации
        Character.isLetter(' ');
        System.out.println(Character.isLetter('a'));// Результат: true - показывает, что символ буква


    }

}
