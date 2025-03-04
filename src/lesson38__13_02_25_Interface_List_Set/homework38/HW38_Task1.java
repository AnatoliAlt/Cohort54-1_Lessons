package lesson38__13_02_25_Interface_List_Set.homework38;

import java.util.*;

/*                                       Home Work 38
                                           Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]

 */
public class HW38_Task1 {
    public static void main(String[] args) {

        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(testString);



        System.out.println("======== 1 ==================");

        // Удаление всех символов кроме букв и цифр
        String newStr = testString.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        System.out.println(newStr);

        System.out.println("======== 2 ==================");

        // Преобразование строки в массив
        String[] words = newStr.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("======== 3 ==================");

        // Преобразование массива в список и удаляем дубликаты
        List<String> list = Arrays.asList(words); // Преобразование массива в список list
        System.out.println(getUniqueList(list)); // Удаляем дубликаты

        System.out.println("======== 4 ==================");
        /*
         Сортировка списка по длине слов в порядке увеличения
         getUniqueList(list) – метод, который принимает list, убирает из него дубликаты и возвращает List<String> с уникальными словами.
         new ArrayList<>(...) – создаёт новый ArrayList и заполняет его элементами из getUniqueList(list).
         Это делается, чтобы иметь список, который можно изменять (например, сортировать).
         Если getUniqueList(list) возвращает Set, то new ArrayList<>(...) превращает его в список, который поддерживает индексацию и сортировку.
         Comparator.comparingInt(String::length) – сортирует по длине.
        .thenComparing(String::compareTo) – если длины равны, сортирует в алфавитном порядке.
         */

        List<String> sortedList = new ArrayList<>(getUniqueList(list));
        sortedList.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        System.out.println(sortedList);


    }

    // Метод, принимающий строку и возвращающий Список ее слов
    static <T> List<T> getUniqueList(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }


}

