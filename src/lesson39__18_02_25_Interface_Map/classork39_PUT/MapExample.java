package lesson39__18_02_25_Interface_Map.classork39_PUT;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class MapExample {
    public static void main(String[] args) {

// Устаревшая, медленная версия Hashtable. Не рекомендуется использовать.
        Map<Integer, String> oldTable = new Hashtable<>();

        //      HashMap

        // Map - по умолчанию параметризована двумя значениями <K, V>

        // Создаем карту Map
        Map<String, String> phoneBook = new HashMap<>();

        // Добавление пары ключ-значение
        // Метод, который называется put() и принимает на вход два параметра: put(K key, V value)
        // Возвращает старое значение, соответствующее этому ключу
        // Если значения не было - то вернет null
        System.out.println(phoneBook.put("Hanna", "+49-11111111")); // вернула нам null

        phoneBook.put("Max", "+49-22222222");
        phoneBook.put("John", "+49-33333333");

        System.out.println("phoneBook: " + phoneBook);

        String oldValue = phoneBook.put("John", "+49-44444444");
        System.out.println("Сохранилось старок значение oldValue: " + oldValue);
        System.out.println("Добавилось новое значение phoneBook: " + phoneBook);

        // Создаем еще одну карту Map

        Map<String, String> book2 = new HashMap<>();
        book2.put("Sebastian", "+49-55555555");
        book2.put("Michael", "+49-66666666");
        System.out.println("book2:" + book2);

        // putAll - принимает карту и копирует все пары ключ-значения из этой карты
        phoneBook.putAll(book2);
        System.out.println("phoneBook.putAll(book2): " + phoneBook);

        // boolean containsKey(Object key) - возвращает true, если карта содержит такой ключ
        // boolean containsValue(Object key) - возвращает true, если в карте есть хотя-бы одно такое значение

        // Поиск ключа - phoneBook.containsKey
        System.out.println("phoneBook.containsKey(Michael): " + phoneBook.containsKey("Michael")); // true - поиск ключа
        System.out.println("phoneBook.containsKey(123): " + phoneBook.containsKey("123")); // false - такого ключа в карте не найден

        // Поиск значения - phoneBook.containsValue
        System.out.println("phoneBook.containsValue(\"+49-66666666\"): " + phoneBook.containsValue("+49-66666666")); // true
        System.out.println("phoneBook.containsValue(\"+38-00000\"): " + phoneBook.containsValue("+38-00000")); // false - такого значения в карте не найдено

        System.out.println("================== GET =======================");

        // Взять значение по ключу - phoneBook.get
        // V get(Object key) - возвращает значение по ключу. Если такого ключа нет - вернет null
        String value = phoneBook.get("Michael");
        System.out.println("phoneBook.get(Michael): " + value); // +49-66666666
        System.out.println("phoneBook.get(KEY): " + phoneBook.get("KEY")); // null

        // getOrDefault(Object key. V defaultValue) - возвращает значение по ключу.
        // Если такого ключа нет - вернет defaultValue
        String val2 = phoneBook.getOrDefault("Michael", "DEFAULT");
        System.out.println("phoneBook.getOrDefault(\"Michael\"): " + val2); // phoneBook.getOrDefault("Michael"): +49-66666666
        val2 = phoneBook.getOrDefault("KEY", "DEFAULT");
        System.out.println("phoneBook.getOrDefault(\"KEY\"): " + val2); // phoneBook.getOrDefault("KEY"): DEFAULT


        System.out.println("Object.hashCode(null): " + Objects.hashCode(null)); // Object.hashCode(null): 0

        // Конструкторы
        // 1.
        Map<Integer, String> test = new HashMap<>(); // Создает пустой список пар ключ-значение
        // 16 корзин. Коэффициент заполнения 0.75 (75%)

        // 2.
        test = new HashMap<>(32); // Создает пустой список. 32 корзины. Коэффициент заполнения 0.75 (75%)

        // 3.
        test = new HashMap<>(32, 0.90f); // Создает пустой список. 32 корзины. Коэффициент заполнения 0.90 (90%)

        // 4. (по умолчанию)
        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(1, "a");
        test = new HashMap<>(otherMap); // Скопирует все пары ключ-значение из otherMap
        System.out.println("test: " + test); // test: {1=a}

        // Метод V remove(Object key) - удаляет пару ключ-значение по ключу.
        // Возвращает удаленное значение или null если такого ключа нет.

        System.out.println(phoneBook);
        System.out.println(phoneBook.remove("Test")); // Ключ есть - удалит пару - вернет старое значение
        System.out.println(phoneBook);
        System.out.println(phoneBook.remove("Test")); // Ключа Test нет - вернет null

        // V clear() - очищает карту удаляет все пары ключ-значение
        // size() - возвращает количество пар ключ-значение
        System.out.println("phoneBook.size(): " + phoneBook.size()); // 5

        // boolean isEmpty() - возвращает true, если карта пуста
        System.out.println("phoneBook.isEmpty(): " + phoneBook.isEmpty()); // false
    }
}
