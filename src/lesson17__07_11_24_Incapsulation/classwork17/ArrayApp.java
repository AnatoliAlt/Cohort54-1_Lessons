package lesson17__07_11_24_Incapsulation.classwork17;

public class ArrayApp {
    public static void main(String[] args) {

        int[] ints = {10, 20, 50, -25, 35, 45, 100, -1, 50 };

        // Создаем объект
        MagicArrayEncap17 magicArray = new MagicArrayEncap17(ints);

        System.out.println(magicArray.toString());
        System.out.println("magicArray.indexOf(10): " + magicArray.indexOf(10));// Результат:
        // индекс 0 значение элемента 10

        System.out.println("magicArray.indexOf(500): " + magicArray.indexOf(500));// Результат:
        // вернул -1 так как значения 500 в массиве нету

        System.out.println();
        // Удаление элемента из массива
        System.out.println("magicArray.removeByValue(20): " + magicArray.removeByValue(20));
        System.out.println(magicArray.toString());// 20 удаленно из массива
        System.out.println();
        // Обновление значения по не существующему индексу
        System.out.println("magicArray.set(100, 1000): " + magicArray.set(100, 1000));
        System.out.println();
        // Обновление значения по существующему индексу
        System.out.println("magicArray.set(0, 1000): " + magicArray.set(0, 1000));
        System.out.println();
        System.out.println(magicArray.toString());
    }
}
