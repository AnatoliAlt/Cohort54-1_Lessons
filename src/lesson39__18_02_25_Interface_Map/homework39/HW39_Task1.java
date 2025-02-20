package lesson39__18_02_25_Interface_Map.homework39;
/*                    Home Work 39
                         Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает
Map<String, Integer>, где каждому слову соответствует количество его вхождений в текст.
 */

import java.util.*;


public class HW39_Task1 {
    public static void main(String[] args) {

        // "Строка для проверки количества вхождений слов" + ".\n Строка для проверки и теста. и количества слов для проверки";
        String text = "(Строка для проверки количества вхождений слов" + ".\n Строка для проверки и теста. и количества слов для проверки.)";

        System.out.println("Строка для проверки: " + text);

        System.out.println("========== 1 = Удаление всех символов кроме букв и цифр =================");

        // Удаление всех символов кроме букв и цифр
        String Str = text.replaceAll("[^a-zA-Z0-9а-яА-Я ]", ""); //.split("\\s+");
        System.out.println(Str);

        System.out.println("===== 2 = Разбиваем строку по пробелам =========");

        // Разбиваем строку по пробелам
        String[] splitString = Str.split("\\s+");

        System.out.println("========== 3 = Создаем карту ключ-значение =================");

        // Создаем карту ключ-значение
        // Map - по умолчанию параметризована двумя значениями <K, V>
        Map<String, Integer> map = new HashMap<>();
        for (String word : splitString) {
            map.put(word, map.getOrDefault(word, 0) + 1);

        }
        System.out.println("Количество вхождений в текст: " + map);

        List<String> sortedList = new ArrayList<>(map.keySet());// преобразование карты в список без повторений

        System.out.println("== 4 = Сортировка по длине слов и алфавиту ==========");

        sortedList.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        System.out.println(sortedList);

    }
}
