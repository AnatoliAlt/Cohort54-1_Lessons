package lesson37__11_02_25.classwork37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих его интерфейсов.
        // Это позволяет единообразно обрабатывать различные типы коллекции.

        // Создаем каллекцию строк
        //Ссылка типа интерфейса -> набор доступных методов + ссылку на объект какого класса может хранить эта переменная
        // Справа мы можем подставить объекты разных классов (получить разные реализации этого интерфейса)

        System.out.println("======= интерфес List === ArrayList =============");

        Collection<String> strings = new ArrayList<>();
        // Слева используем ссылку типа интерфейс, а справа используем конкретную реализацию (класс)

        // int size() - возвращает количество элементов в коллекции
        System.out.println("strings.size(): " + strings.size());

        // boolean isEmpty() - возвращает (boolean) true, если коллекция пуста
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        // boolean add(T t) - добавляет элемент в коллекцию и возвращает (boolean) true, если добавление прошло успешно и
        // false если добавить не получилось.

        strings.add("Hello");
        System.out.println("strings.add(\"Python\"): " + strings.add("Python"));

        // Переопределенный метод toString() - для красиваго вывода элементов коллекции
        System.out.println(strings);

        System.out.println("========= addAll ===============");

        // Метод .of() - это статический метод в нескольких интерфейсах и классах. Был введен в Java 9
        // Создает неизменяемый экземпляр коллекциии из предоставленных элементов.
        // Доступен для List, Set, Map.
        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5); // -> .of -> создает неизменяемую коллекцию
        System.out.println("integers: " + integers);

        //   integers.add(7); // Нельзя - Попытка добавить элемент в неизменяемую коллекцию приведет к ошибке.
        // Самый удобный метод добавления элемента в коллекцию - метод .of()

        // addAll(Collection<? extends T> col) - добавляет все элементы из указанной коллекции
        strings.addAll(List.of("JS", "Go Land", "Roby")); // таким образом мы добавляем все элементы в strings

        System.out.println(strings); // Добавили новые элементы "JS", "Go Land", "Roby" в коллекцию strings (Hello, Python).

        System.out.println("============ removeAll ===============");

        // removeAll(Collection<?> col) - (удалить все) удаляет все элементы содержащиеся в коллекции col (параметр)
        // из коллекции на которой вызван метод.

        Collection<Integer> numbers = new ArrayList<>();

        numbers.addAll(List.of(0, 1, 2, 3, 4, 5, 3, 3));
        System.out.println("numbers: " + numbers);

        numbers.removeAll(List.of(3, 2, 1));
        System.out.println("numbers.removeAll(List.of(3, 2, 1)): " + numbers); // true

        System.out.println("========== retainAll =============");

        // Пересечение
        // retainAll(Collection<?> col) - (оставить только) оставляет только элементы содержащиеся в коллекции col (параметр)
        // коллекция col - это коллекция пришла в качестве аргумента (параметра).
        // Удаляет из коллекции все элементы, которые не содержатся в коллекции col (параметр).
        // [3, 3, 2, 2, 1] retainAll [3, 2] -> [3, 3, 2, 2]

        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 20, 40, 50, 20, 60));
        colB.addAll(List.of(20, 30, 40));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        colA.retainAll(colB);
        System.out.println(" colA.retainAll(colB): " + colA);

        System.out.println("=========== remove ====================");

        // boolean remove (Object obj) - удаляет элемент из коллекции. Возвращает true, если элемент был удален.
        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println("colA.remove(20): " + colA.remove(20)); // Удалит одно значение (20)
        System.out.println("colA: " + colA);
        colA.removeAll(List.of(20)); // Удалит все значения (20)
        System.out.println("colA: " + colA);

        System.out.println("================ clear() ===================");

        // clear() - Удаляет все элементы из коллекции.
        colA.clear();
        System.out.println("colA: " + colA);

        System.out.println("======= интерфейс List === LinkedList ==========");



    }
}
