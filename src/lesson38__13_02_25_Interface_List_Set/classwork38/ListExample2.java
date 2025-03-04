package lesson38__13_02_25_Interface_List_Set.classwork38;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 10, 100, -5, 0, 100, 11, 54));

        // Метод поиска элементов по значению - возвращает индекс
        // int indexOf(Object obj) - первое вхождение
        // int lastIndexOf(Object obj) - последнее вхождение

        System.out.println("list.indexOf(100): " + list.indexOf(100));
        System.out.println("list.lastindexOf(100): " + list.lastIndexOf(100));
        System.out.println("list.indexOf(-10000)): " + list.lastIndexOf(-10000));
        System.out.println("list.indexOf(\"String\"): " + list.indexOf("String"));

        // void sort(Comparator<? super E> comparator) - сортирует список с использованием указанного компаратора

        // Метод sort() сортирует список на месте (изменяет исходный список).
        // Cортирует список list по возрастанию с использованием лямбда-выражения.
        // перебор элементов в лбратном порядке
        list.sort((i1, i2) -> Integer.compare(i2, i1)); // [100, 100, 54, 11, 10, 1, 0, -5]
        System.out.println(list);

        list.sort((Integer::compare)); // [-5, 0, 1, 10, 11, 54, 100, 100]
        System.out.println(list);

        // С использованием статического корпаратора
        list.sort(Comparator.naturalOrder()); // [-5, 0, 1, 10, 11, 54, 100, 100]
        System.out.println(list);

        list.sort(Comparator.reverseOrder()); // [100, 100, 54, 11, 10, 1, 0, -5]
        System.out.println(list);


        // List<E> sublist()
        // List<E> sublist(int idxFrom, int idxTo) - Возврашает список из элементов,
        // находящихся на позициях от idxFrom до idxTo (не включительно).
        List<Integer> subList = list.subList(1, 5);
        System.out.println("list.subList(1, 5): " + subList); // (List.of(1, 10, 100, -5, 0, 100, 11, 54)); -> list.subList(1, 5): [100, 54, 11, 10]

    }
}
