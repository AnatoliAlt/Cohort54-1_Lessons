package lesson41__25_02_25.homework41;

import java.util.List;
import java.util.stream.Collectors;

/*
                                 Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
 */
public class HW_Task1 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 150, 99, 55);
        List<Integer> intergerList = integers.stream()
                .filter(i -> i > 10 && i < 100 && i % 2 == 0)
                .peek(i -> System.out.println(i))
                .sorted()
                .collect(Collectors.toList());// Собираем результат в список
        System.out.println("Отфильтрованный список соответствующий условиям четные, больше 10 и меньше 100: " + intergerList);
    }

}
