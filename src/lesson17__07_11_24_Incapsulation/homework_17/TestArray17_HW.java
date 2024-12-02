package lesson17__07_11_24_Incapsulation.homework_17;

import java.util.Arrays;

public class TestArray17_HW {
    public static void main(String[] args) {

        MagicArray17_HW magic = new MagicArray17_HW();

        magic.addAll(10, 20, 30, 40, 50);

        System.out.println(magic.toString());

        // Нельзя выдавать get/set для полей нашего класса.
        // У нас другие методы для изменения состояния этих полей

        //int cursor = magic.getCursor();
        //cursor = 1000;

        //magic.setCursor(20);

        // int[] arrayCopy = magic.getArray();
        // arrayCopy[3] = 5000;

        // int[] arr = {1, 2, 3};
        // magic.setArray(arr);

        magic.add(60);//  Добавляем еще адин элемент в массив
        magic.addAll(20, 200);

        System.out.println(magic.toString());

        System.out.println("magic.indexOf(20): " + magic.indexOf(20));// Находим первый индекс массива элемента 20 - [10, 20, 30, 40, 50, 60, 20, 200]
        System.out.println("magic.lastIndeyOf(20): " + magic.lastIndeyOf(20));// Находим последний индекс элемента 20 - [10, 20, 30, 40, 50, 60, 20, 200]

        int[] array = magic.toArray();
        System.out.println("array.length: " + array.length);// Длина массива: Результат-  array.length: 8
        System.out.println("Arrays.toString(array): " + Arrays.toString(array));// Новый массив: Результат - Arrays.toString(array): [10, 20, 30, 40, 50, 60, 20, 200]

    }
}
