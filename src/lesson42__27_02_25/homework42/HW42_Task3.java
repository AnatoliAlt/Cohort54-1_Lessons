package lesson42__27_02_25.homework42;

import java.util.List;
import java.util.stream.Collectors;

public class HW42_Task3 {
    /*                      Home Work 42
                              Task_3
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа, затем
каждое число умножить на 2, и собрать результат в новый список
     */
    public static void main(String[] args) {

        List<Integer> listOfNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 14, 15, 16, 17, 18, 19, 20);// Список чисел
        System.out.println("Список чисел: " + listOfNumbers);
        List<Integer> newList = listOfNumbers.stream()
                .filter(num -> num % 2 == 0) // Фильтруем список и оставляем только четные числа
                .peek(num -> System.out.print(num + " (*2), "))
                .map(num -> num * 2) // Умножаем каждое число на 2
                .collect(Collectors.toList()); // Собираем результат в новый список

        System.out.println("\nНовый список: " + newList);
    }
}
