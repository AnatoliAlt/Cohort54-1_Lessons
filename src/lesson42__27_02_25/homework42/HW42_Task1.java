package lesson42__27_02_25.homework42;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HW42_Task1 {
    /*                       Home Work 42
                               Task 1
Из списка целых чисел выделите те значения, которые больше 10; отсортируйте
эти значения по значению последней цифры в числе и выведите результат на экране
     */
    public static void main(String[] args) {

        // Сортировка чисел по последней цифре
        // Создаем список чисел
        List<Integer> sortByLastValue1 = List.of(1, 2, 3, 4, 35, 6, 7, 8, 9, 10, 23, 12, 13, 14, 15, 16, 77, 18, 19, 20);
        System.out.println("Список чисел: " + sortByLastValue1);
        System.out.println("Сортировка чисел по последней цифре: " + sortByLastValue2(sortByLastValue1));


        System.out.println("============= Random ========================");
        // Сортировка случайных значений Random по последней цифре
        List<Integer> integers = Stream.generate(() -> new Random() // Генерируем список случайных чисел
                .nextInt(-100, 100)) // в диапазоне от -100 до 100
                .limit(5) // Ограничиваем список до 5 элементов
                .toList(); // Преобразуем поток в список
        System.out.println("Список случайных чисел Random: " + integers);

        List<Integer> sortByLastValue = integers.stream() // Создаем поток
                .filter(num -> num > 10)// Сортируем числа больше 10
                .sorted(Comparator.comparing(num -> num % 10)) // Сортируем числа по последней цифре
                .toList(); // Преобразуем поток в список
        System.out.println("Сортировка чисел Random по последней цифре: " + sortByLastValue);

    }

    private static String sortByLastValue2(List<Integer> sortByLastValue1) {


        return sortByLastValue1.stream()// Создаем поток
                .filter(num -> num > 10)// Сортируем числа больше 10
                .sorted(Comparator.comparing(num -> num % 10))// Сортируем числа по последней цифре
                .collect(Collectors.toList())
                .toString();// Преобразуем поток в список

    }
}
