package lesson_19__14_11_24.classwork19;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderExample {

    public static void main(String[] args) {

        // В памяти создается слишком много объектов
        // Java -> Java is -> Java is the -> Java is the best
        String str = "Java " + "is " + " " + "the " + "best";
/*
StrigBuilder - это специальный класс, предназначенный для эффективного создания и модификации изменяемых
последовательностей символов.
В отличие от класса String - объекты StringBuilder могут изменяться без создания новых объектов в памяти, что
повыщает производительность при чамтых операциях со строками.
*/
        // Конструктор перегружен. Может быть пустым, может принимать String.
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("Hallo");

// Метод для добавления в конец строки (приклеить справа) / аналог конкатенации.
        sb1.append("_");
        sb1.append("World").append("!"); // Результат: Hallo_World!

        // Метод - позволяющий получить строковое представление (String).
        String string = sb1.toString();
        System.out.println(string); // Результат:

        // Вставить символы в указанную позицию.
        sb = new StringBuilder("Hello World");

        // sb.insert(в какую позицию вставлять - 6, что вставлять - "beautiful ");

        // insert - ВСТАВИТЬ
        sb.insert(6, "beautiful ");
        System.out.println(sb.toString());

        /*
        // beautiful - вставить в середину строки "Hello World" в 6 индекс.
        // Разделение строки "Hello World"
        String s = "Hello World";
        String s1 = s.substring(0,6);
        String s2 = s.substring(6);
        System.out.println(s1);
        System.out.println(s2);
        String res = s1 + "beautiful " +s2;
        System.out.println(res);
         */

        // Заменить строку (определяется индексами) на указанное значение
        sb = new StringBuilder("Hello World!");

        // Замена слова World на другое слово

        // replace - ЗАМЕНИТЬ
        sb.replace(6, 11, "Java"); //  Верхняя граница не включается.
        System.out.println(sb.toString());

        // Удалить подстроку (слово) в диапазоне индексов.
        // Удаляем из строки слово World
        sb = new StringBuilder("Hello World!");

        // delete - УДАЛИТЬ
        sb.delete(5, 11);
        System.out.println(sb.toString());

        // Реверс - Разворачивет последовательность символов.
        sb = new StringBuilder("Hello World!");

        // reverse - РАЗВОРАЧИВАТЬ
        sb.reverse();
        System.out.println(sb.toString());

        // Количество символов (длина) в строке.
        System.out.println("sb.length (Hello World!): " + sb.length());

        // Получить символ по индексу.
        char ch = sb.charAt(3);
        System.out.println("Под индексом 3 в строке находится символ: " + ch);

        // Получить подстроку по индексу / индексам
        sb = new StringBuilder("Hello World!");
        String subString = sb.substring(1); // От индекса до конца строки.
        System.out.println(subString); // Результат: ello World!

        subString = sb.substring(6, 9); // от start до end (верхняя граница не включительно)
        System.out.println(subString); // Результат: Wor

        // Изменять размер последовательности символов
        sb = new StringBuilder("Hello");
        System.out.println(sb.length() + " символов"); // Результат: 12

        // Увеличиваем длину строки до 10 символов
        sb.setLength(10);
        // Если увеличиваем строку, она будет заполнена char с кодом 0
        System.out.println("set<lenght(10): " + sb.toString()); // Результат: set<lenght(10): Hello00000
        char ch1 = sb.charAt(8);

        // Находим десятичный код символа 8
        System.out.println("Код символа: sb.charAt(8): " + (int) ch1); // Результат: Код символа: sb.charAt(8): 0

        // Уменьшение длины строки
        sb.setLength(3);
        System.out.println("setLength(3): " + sb.toString()); // Результат: setLength(3): Hel

        // Еще один способ конкатинации строк, метод join
        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example); // Результат: Java is the best

        // Метод .split - РАЗДЕЛИТЕЛЬ
        String[] strings = example.split(" ");
        System.out.println("example.split: " + Arrays.toString(strings)); // Результат: example.split: [Java, is, the, best]

    }

    /*
       Задание -
       Написать метод, который запрашивает у пользователя строку, состоящую из нескольких слов
       и вазвращающий аббревиатуру этой фразы (первые буквы каждого слова, зависанные в верхнем регистре)
       Привет Джава разработчик -> ПДР
       Использовать StringBuilder
        */
    private static String pharseString() {
         /*
         1. Запросить у пользователя строку
         2. Разбить строку на массв слов
         3. Перебрать все слова в цикле
         4. Из каждого слова взять первую букву, и приклеить ее к результату
         5. Когда все слова перебрали - получть строку и привести ее к верхнему регистру -> вернуть
          */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, состоящую из нескольких слов");

        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        // String result = "";

        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            sb.append(word.charAt(0));
            // result = result + word.charAt(0);

        }
        return sb.toString().toUpperCase();

    }
}
