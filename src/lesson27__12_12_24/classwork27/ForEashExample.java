package lesson27__12_12_24.classwork27;

import listsTest.MyArrayList;
import listsTest.MyList;

import java.util.Iterator;

public class ForEashExample {

    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        while (iterator.hasNext()) {
            String str = iterator.next();
        }
        System.out.println("=============== Цикл forEach работает только с Iterator =================");
        /*
         Цикл forEach
         for (Тип переменной переменная : колекция)
                 Действия с переменной
          Полный аналог строки -  String str = iterator.next();
          Цикл forEach можно употреблять только к тем данным, которые реализовали у себя интерфейс Iterable
         */

        for (String str : list) {
            System.out.println(str);

        }
        System.out.println("===================");
        // Другой пример
        MyList<Integer> iterators = new MyArrayList<>();
        iterators.addAll(1, 3, 5, 7, 9, 11, 13);

        for (Integer element : iterators) {
            System.out.print(element + ", ");
            System.out.println(element + 100 + ", ");
            /*
             Результат: ,
             1,  101,
             3,  103,
             5,  105,
             7,  107,
             9,  109,
             11, 111,
             13, 113,
             */

        }

    }
}
