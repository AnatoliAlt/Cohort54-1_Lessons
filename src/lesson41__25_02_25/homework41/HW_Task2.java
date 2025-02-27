package lesson41__25_02_25.homework41;
/*                    Home Work 41
                          Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.
 */


import java.util.List;
import java.util.stream.Collectors;

public class HW_Task2 {

    public static void main(String[] args) {

        listOfStrings();
    }

    private static void listOfStrings() {
        // Список имен
        List<String> strings = List.of("Anna", "Leon", "Maksim", "Lena", "Vladimir", "Yana", "Zhenya");
        System.out.println("Список имен: " + strings); // Распечатка списка имен
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.startsWith("L")) // отфильтруем строки, которые начинаются на "L"
                .collect(Collectors.toList()); // Список имен на первую букву L
        //System.out.println();
           List<String> sortedStrings = filteredStrings.stream() //
                  .sorted() // Сортировка списка имен в алфавитном порядке из списка на первую букву L  .filter(s -> s.startsWith("L"))
                  .collect(Collectors.toList()); // Список имен в алфавитном порядке из списка имен на первую букву L
        System.out.println("Спсок имен на первую букву L: " + filteredStrings);
        System.out.println("Спсок имен в алфавитном порядке: " + sortedStrings);
    }


}
