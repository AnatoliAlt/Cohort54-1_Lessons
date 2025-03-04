package lesson42__27_02_25.homework42;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HW42_Task2 {
    /*               Home Work 42
                        Task 2
Имеется список строк. Используя Stream API, найдите строку по длине и с минимальной длиной.
     */

    public static void main(String[] args) {

        List<String> strings = List.of("Java", "Python", "Kotlin", "C++", "JavaScript");

        // Сортировка по длине строк
        List<String> lengthString = strings.stream()
                .sorted(Comparator.comparing(String::length)) // Сортировка по длине строк
                //  .min(Comparator.comparing(String::length))
                .collect(Collectors.toList()); // Собираем в список
        System.out.println("Cортировка по длине строк: " + lengthString);

        // Строка с минимальной длиной
        List<String> minimumStringLength = strings.stream()
                .filter(str -> str.length() == strings.stream()// Фильтруем строки по длине
                        .min(Comparator.comparing(String::length))// Строка с минимальной длиной
                        .get() // Получаем строку из Optional
                        .length()) // Получаем длину строки
                .collect(Collectors.toList()); // Собираем результат в список
        System.out.println(minimumStringLength);

    }
}
