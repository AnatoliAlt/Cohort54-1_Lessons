package lesson26__10_12_24.classwork26;

import listsTest.MyArrayList;
import listsTest.MyList;

import java.util.Arrays;

public class ListTest {
    public static void main(String[] args) {

        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);

        // Если не указать параметр типа (<Integer>), по умолчанию он будет <Object>
        MyArrayList arrayList1 = new MyArrayList<>();
        arrayList1.add("jdhfidfh"); // <Object> - Принимает все данные и строки и числа

        MyList<Integer> numbers = new MyArrayList<>();
        numbers.addAll(1, 2, 3, 4, 5, 6);
        System.out.println(numbers);

        System.out.println("numbers.indexOf(5): " + numbers.indexOf(5) + " индекс");

        System.out.println(numbers.remove(0));
        System.out.println("Удалили первый индекс в массиве: " + numbers);

        System.out.println("Удалили первое значение в массиве: " + numbers.remove(Integer.valueOf(2)));
        System.out.println(numbers);

        numbers.add(100);
        System.out.println(numbers);

        System.out.println("============================================");

        MyList<String> strings = new MyArrayList<>();
        strings.add("Java");
        System.out.println(strings);
        strings.addAll("Python", "C#", "Scala", "Kolin");
        System.out.println(strings);

        System.out.println("Удаляем слово по индексу 2: " + strings.remove(2));
        System.out.println(strings);

        System.out.println("Удаляем слово по значению 2: " + strings.remove(2));
        System.out.println(strings);

        System.out.println("=========================================");

        numbers.addAll(10, 20, 30, 40, 50, 60, 70, 80, 90);
        System.out.println(numbers);

        Object[] array1 = numbers.toArray();
        System.out.println("Object: " + Arrays.toString(array1));
         Integer[] array = numbers.toArray();
        System.out.println("Integer: " + Arrays.toString(array));

        System.out.println("=============================================");

        // Стирание типов в JAVA

        MyList<String> strings1 = new MyArrayList<>();
        strings1.add("Java");
        String value = strings1.get(0);
        System.out.println(value.toUpperCase());

        String[] arrayStr = strings1.toArray();
        System.out.println("arrayStr: " + Arrays.toString(arrayStr));

        Integer i1 = numbers.get(0);
        System.out.println(i1);

        // Не считается перегруженным методом
        //  public static void test(MyList<String> list) {
        //  }
        //  public static void test(MyList<Integer> list){
        //  }

        MyList<Double> doubles = new MyArrayList<>();
        Double[] doubles1 = doubles.toArray();
        System.out.println("doubles: " + Arrays.toString(doubles1));


        System.out.println("============= РЕФЛЕКЦИЯ 01.21.00 ============");
    }


}