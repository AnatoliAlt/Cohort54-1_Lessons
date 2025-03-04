package listsTest;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {

    // 1.
    private T[] array; // Ссылачка на какойто массив целых чисел
    // 2. Указатель на пустую ячейку в массиве
    private int cursor; // присвоенное значение по умолчанию - 0

    //@Override
    //public void add(Object value) {

    //}

    // 3. Создаем пустой конструктор
    @SuppressWarnings("unchecked")
    public MyArrayList() {
        array = (T[]) new Object[10];

    }

    // Создаем новый конструктор
    @SuppressWarnings("unchecked")
    public MyArrayList(T[] ints) {

        if (ints != null) {
            //this.array = new int[ints.length];
            this.array = (T[]) new Object[ints.length * 2];
            addAll(ints);
        } else {
            this.array = (T[]) new Object[10];
        }

    }

    // 6. Создаем метод. add - добавить (перевод с английского)
    @Override
    public void add(T value) { // 01:15:

        // 20. 02:04: Проверка. Есть ли свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length - 1) {
            // Курсор указывает на последнюю свободную ячейку
            // 02:06: Расширить массив перед добавлением нового элемента 
            expandArray(); // 21. - вызов какогото метода. Метод который расширяет наш массив
        }

        array[cursor] = value;
        cursor++;
    }

    // 22.- (метод образуется автоматически от IDEA) Динамическое изменение размера массива
    public void expandArray() {
        // 23.
        System.out.println("Расширяем массив! cursor: " + cursor);

        /*
        02:11:
        1. Создать массив большего размера (в два раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */
        @SuppressWarnings("unchecked")
        // 1.
        T[] newArray = (T[]) new Object[array.length * 2];

        // 2.
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписываю все значения из старого массива в новый
        }

        // 02:20:
        // 3. Перебросить ссылку. Переменная array хранила ссылку на "новый" массив
        array = newArray;
        // 24. 02:23:30
        System.out.println("Расширение массива завершено");


    }

    @SuppressWarnings("unchecked")
    @Override
    // 16. Добавляем в массив сразу несколько значений
    public void addAll(T... values) {// Три точки "..." означает, что он может принять не одно, а большое количество значений
        // с values я могу обращаться точно также, как со ссылкой на массив int
        // System.out.println("Мы приняли несколько int-ов. А именно: " + values.length);
        // System.out.println("У каждого значения есть индекс. Под индексом 0: " + values[0]);

        // 18.
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }

    }

    //02:32:20
    // 25. Удаление элемента по индексу
    @Override
    public T remove(int index) {
        /*
        1. Проверить валидность индекса и, что он не отрицательный и меньше курсора (cursor)
        2. Запомнить, какое значение находилось под этим индексом
        3. Удалить значение из ячейки
        4. Перелвинуть все элементы за индексом на 1 ячейку влево
        5. Передвинуть карсор влево
        6. Врнуть старое значение
         */

        // 27. Проверяем
        if ((index < 0 || index >= cursor)) {
            // Индекс не валидный. То ничего в массиве не трогаем
            //return Integer.MIN_VALUE;
            throw null;
        }


        // 26.
        // 2. Запомнить значение
        T value = array[index];
        // 28.
        // 3, 4.
        for (int i = index; i < cursor; i++) {
            array[i] = array[i + 1];

        }
        cursor--;
        return value;
    }


    // 14. Текущее количества элементов в массиве
    @Override
    public int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            // Если наш индекс валидный, то возвращаем return элемент с именем индекс
            return array[index];
        }
        return null;
        // Так как if закончился оператором return - то блок else писать не обязательно
        //return Integer.MIN_VALUE;// Хорошего решения нет и возвращаем минимальное число диапазона

    }


    // [10, 100, 44, 100, 453, 100, 34]
    // Поиск первого вхождения элемента по значению.
    // Возвращает индекс элемента. Если значение не найдено возвращает -1 (не существующий индекс для любого массива)
    @Override
    public int indexOf(T value) {// Метол IndeyOf принимает какое-то значение int value
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {// если мы нашли, то значение которое искали ->
                // нашли первое значение
                return i;// -> то возвращаем этот индекс i (его значение)
            }

        }
        // Перебрали все элементы. Но не нашли ни одного совпадения.
        return -1;

    }

    // Поиск последнего вхождения элемента по значению
    @Override
    public int lastIndeyOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //13.  Метод, который возвращает все значения в виде обычного массива
    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {
        //   T[] result = (T[]) new Object[cursor];
        if (cursor == 0) {
            return null;
        }
        //
        // Взять какой-то объект из моего массива и узнать на стадии выполнения программы тип этого объекта.
        // И потом используя рефлексию я могу создать массив этого типа данных.

        Class<T> clazz = (Class<T>) array[0].getClass();
        System.out.println("clazz: " + clazz);

        // Создать массив такого-же типа как 0-й элемент

        T[] result = (T[]) Array.newInstance(clazz, cursor);

        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        System.out.println("result: " + Arrays.toString(result));
        return result;

    }


    // Удаление элемента по значению
    public boolean remove(T value) {
        /*
        1. Нужно проверить, есть ли у нас такой элемент в массиве
        2. Если нет - то вернуть false
        3. Если есть - то удалить этот элемент
        4. Вернуть true после удаления
         */

        // 1.
        int index = indexOf(value);

        // 2. Значение не найдено. Удалять нечего. Возврашаем folse.
        if (index == -1) return false;

        //  3. Если есть - то удалить этот элемент
        // Преиспользуем существующий метод remove для удаления элемента по индексу
        remove(index);

        //  4. Вернуть true после удаления
        return true;

    }


    @Override
    public boolean contains(T value) {
        // -1 - элемента нет. indexOf 0 и больше? элемент содержится
        // indexOf(value);
        return indexOf(value) >= 0;
//        int index = indexOf(value);
//        if (index >= 0){
//            // Элемент найден
//            return true;
//        }else {
//            // index меньше нуля (минус 1).
//            // значит такого элемента нет.
//            return false;
//        }
    }

    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }

    //  11. Замена значения по индексу (есть индекс и новое значение) --- и возвращает старое значение
    @Override
    public T set(int index, T newValue) {
/*
1. Проверить валидацию индкса от 0 до cursor
2. Вытащить старое значение - и запомнить его
3. Записать новое значение
4. Вернуть старое значение
 */
        // 1.
        if (index < 0 || index >= cursor) {
            // Индекс невалидный
            System.out.println("Невалидный индекс: " + index);
            return newValue;
            //return Integer.MIN_VALUE;
            // TODO Поправить обработку не валидности индекса
        }

        // Если индекс валидный, то
        T oldValue = array[index]; // в int oldValue сохраняем старое значение в промежуточную переменную, что бы оно не потерялось
        array[index] = newValue; // в array[index] записываем новое значение
        return oldValue; // в oldValue возвращаем старое значение

    }


    // 9. 01:19:30
    // Возвращает строковое представление массива.
    // [100, 200, 500]
    @Override
    public String toString() {

        /*
        Открыть скобочку.
        Перебрать элементы. Добавить каждый элемент, добавить запятую (если элемент не последний)
        Закрыть скобочку
         */
        // 13. Если у нас нет текущих значений и cursor стоит на 0, то распечатываются только "[]"
        // А если cursor не на 0, то код будет формировать (распечатывать) строку
        if (cursor == 0) return "[]";

        // 10.
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + ((i < cursor - 1) ? ", " : "]");// Тернарный оператор

        }
        return result;
    }
/*
Интерфейс Iterable - означает, что объекты этого класса можно перебирать (итерировать)
Метод Iterator<T> iterator() - возвращает итератор для коллекции

Интерфейс Iterator - собственно итератор, который позволяет обходить коллекцию
     boolean hasNext() - показывает естьт ли следующий элемент.
     T next() - возвращает следующий элемент
     void remove() - не обязательный - удаляет последний возвращенный элемент
 */

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {

        private int currentIndex = 0;


        @Override
        public boolean hasNext() {
            return currentIndex < cursor;
        }

        @Override
        public T next() {
            return array[currentIndex++];

            // return get(currentIndex++) - нежелательный вариант
            // или
            // T value = array[currentIndex];
            // currentIndex++;
            //return value;
        }
    }
}
