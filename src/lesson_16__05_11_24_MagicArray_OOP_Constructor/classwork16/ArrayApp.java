package lesson_16__05_11_24_MagicArray_OOP_Constructor.classwork16;

public class ArrayApp {


    public static void main(String[] args) { //4.

        // 5. Создаем объект класса MagicArray и вызываем пустой конструктор 3.
        MagicArray magicArray = new MagicArray();

        MagicArray magicArray1 = new MagicArray();

        // 12. Распечатывает только - 10. String result = "[";
        System.out.println(magicArray1.toString());

        // 15. Текущее количества элементов в массиве
        System.out.println("size: " + magicArray.size());

        // 7.
        magicArray.add(100);
        // 8.
        magicArray.add(200);

        // 11. Поучаем строковое представление нашего объекта (массива)
        String info = magicArray.toString();
        System.out.println(info);

        // 15.Текущее количества элементов в массиве
        System.out.println("size: " + magicArray.size());

        System.out.println("\n ============================== \n");

        // 17. Прегрузка массива по количеству элементов
        magicArray.addAll(300, 400, 500, 600, 700, 800, 900,1000, 1100, 2000);
        // 19.
        System.out.println(magicArray.toString());
        System.out.println("size: " + magicArray.size());

        // 24. Смотрим сколько у нас элементов в массиве
        System.out.println("У нас элементов в массиве size: " + magicArray.size());

        System.out.println("\n =======================================\n ");
        // 29.
        System.out.println("Удален (index) элемент magicArray.remove(7) " + magicArray.remove(7));
        System.out.println("size " + magicArray.size());
        System.out.println(magicArray.toString());

    }
}
