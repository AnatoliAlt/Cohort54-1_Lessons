package lesson37__11_02_25.classwork37;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // Кострукторы
        System.out.println("========= Конструкторы ArrayList ==================");

        // Конструкторы ArrayList
        List<Integer> list = new ArrayList<>(); // Создает пустой список (с начальной емкостью на 10 элементов).
        list = new ArrayList<>(50); // Пустой список с указанной емкостью.
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100)); // Принисает коллекцию
        // Создает список, содержащий все элементы указанной коллекции (копирование элементов из другой коллекции)

        System.out.println("============== Конструкторы LinkedList ==================");

        // Конструкторы LinkedList
        list = new LinkedList<>(); // Создает пустой список (внутренняя реализация - двусвязный список)
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25, -100)); // Создает список, содержащий все элементы указанной коллекции.

        System.out.println("========= методы интерфейса List ====================");

        // методы интерфейса List
        list.add(1000);
        list.add(-100);
        System.out.println("list: " + list);

        // void add(int index, E element) - добавляет элемент на указанную позицию.
        list.add(3, 500);
        System.out.println("list: " + list);

        // Метод - E get(int index) - возвращает элемент по индексу
        Integer value = list.get(5);
        System.out.println("value: " + value);

        System.out.println("========== E remove из интерфейса List =======");

        // Удаляет элемент по указанному индексу и возвращает старое значение.
        System.out.println("Удаляем значение 25 по индексу 5: " + list.remove(5));
        System.out.println("list: " + list);

        // boolean remove(Object obj) - Метод удаления по значению (из интерфейса Collection) - принимает
        // Object (ссылочный тип).
        System.out.println(list.remove(Integer.valueOf(0)));
        System.out.println("list: " + list);

        // indexOf
        // lastIndexOf
        // sort(Comparator)
        // List<E> sublist()

    }
}
