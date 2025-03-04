package lesson40__02_02_25_Map.classwork40;

import java.util.*;

public class MapExample2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "red"); // красный
        map.put(4, "green"); // зеленый
        map.put(15, "yellow"); // желтый
        map.put(16, "blue"); // синий
        map.put(0, "while"); // белый
        map.put(100, "black"); // черный
        map.put(17, "orange"); // оранжевый
        map.put(7, "red"); // красный

        System.out.println(map);

        // Collection<V> values() - возвращает коллекцию всех значений
        Collection<String> values = map.values(); // [red, green, yellow, blue, while, black, orange>
        System.out.println("map.values(): " + values);

        // Set<K> keySet() - возвращает set, состоящий из всех ключей карты
        Set<Integer> keys = map.keySet(); // [1, 4, 15, 16, 0, 100, 17]
        System.out.println("map.keySet(): " + keys);

        // Можно перебрать ключи в цикле и получить все значения
        for (Integer key : keys) {
            System.out.print(map.get(key) + "; ");
        }
        System.out.println();

        // Фокус. "Живая связь" между картой и ее представлениями.
        // Метод keySet возвращает представления (views) соответствующих ключей карты, которое ->
        // может быть использовано для последующего перебора ключей карты.
        // Это представление поддерживается самой картой, что означает, что они напрямую связаны с внутренними ->
        // данными HashMap().
        // Поэтому любые изменения, внесенные в эти представления, отражаются на исходной карте.
        // Причем связь двусторонняя

        keys.remove(17); // Удаляем ключ 17
        System.out.println("keys: " + keys);
        System.out.println("map: " + map); // Ключ 17 со значением orange удалили
        System.out.println("values: " + values);
        values.remove("green"); // Удаляем значение (values) green
        map.remove(16); // Удаляем ключ (map) 16
        System.out.println("\n ======= values.remove(4 \"green\") ===========");

        System.out.println("kays: " + keys);
        System.out.println("map: " + map);
        System.out.println("velues: " + values);

        System.out.println("\n ======= values.remove(\"red\") ===========");
        // values.remove("red");// Удаляем только одно значение (values) red
        //  values.remove(List.of("red")); // Удаляем только одно значение (values) red
        //  System.out.println("velues: " + values);
        values.removeAll(List.of("red")); // Удаляем все значения (values) "red"
        System.out.println("map: " + map);
        System.out.println("Удаленные значения velues (red): " + values);
        // values.add("red"); // Добавить значение (values) red не возможно
        // System.out.println(values);
        System.out.println("map: " + map);

        System.out.println("== keySet = копирование ключей из map ===");

        // Копирование ключей из map в новую коллекцию для работы с коллекцией, которая не связана с map,
        // без влияния на map, внесения изменений в коллекцию map.
        Set<Integer> newKeys = new HashSet<>(map.keySet()); // Копирование значений из map
        System.out.println("newKeys: " + newKeys);
        newKeys.remove(0);
        newKeys.remove(100);
        System.out.println("map: " + map);

        System.out.println("=========== Map.Entry === entrySet ======");

        // Вложенный интерфейс Map.Entry<K, V> представляет пару ключ-значение.
        // Set<Map.Entry<K, V>> entrySet() - возвращает set вхождений всех пар ключ-значение
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print("entry: " + entry + " -> ");
            System.out.print("entry.getKey(): " + entry.getKey() + " | "); // Получить ключ
            System.out.println("entry.getValue(): " + entry.getValue()); // Получить значение
        }
        // Тоже "живая связь"
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(100)) {
                entry.setValue("JAVA!");
            }
        }
        System.out.println();
        System.out.println("map: " + map);

        System.out.println("========== put vs replace ==============");
        System.out.println(map.put(11, "orange")); // put - если ключа нет - новая пара key-value добавилась.
        System.out.println(map.put(11, "green")); // put - если ключ есть - значение будет перезаписано на green

        // replace(K key, V value) - если такого ключа нет, новая пара не создается
        // Если ключ есть - значение будет перезаписано на value

        System.out.println(map.replace(200, "red")); // replace - если ключа нет - то новая пара не добавилась.
        System.out.println(map.replace(15, "red")); // replace - если ключ есть - значение будет перезаписано на red
        System.out.println("map: " + map);

        System.out.println("===== Option1 = Многострочное действие ========");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            // могу с ними что-то делать
        }
            // Перебор всех пар ключ-значение в стоку с возможностью применить к ним какую-то функцию
            map.forEach((key, value) -> { System.out.println("forEach:key: " + key + " | Value: " + value); });


        System.out.println("=== Option 2 - Многострочное действие == forEach ========");
        // Перебор всех пар ключ-значение с возможностью применить к ним какую-то функцию
        map.forEach((key, value) -> {
            System.out.println("Interger: ");
            System.out.println("key: " + key + " | Value: " + value);
            System.out.println("==============================");
        });

    }
}
