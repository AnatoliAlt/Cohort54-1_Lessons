package lesson37__11_02_25_List_Java_Collections_Framework.homework37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*                 Home Work 37
                      Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */



public class HW37_Task1 {
    public static void main(String[] args) {

        Collection<Integer> collection1 = new ArrayList<>();
        collection1.addAll(List.of(0, 1, 2, 3, 4, 5, 4, 6));

        Collection<Integer> collection2 = new ArrayList<>();
        collection2.addAll(List.of(4, 5, 6, 7, 8, 9, 10));

        System.out.println("Array collection1: " + collection1);
        System.out.println("Array collection2: " + collection2);

        collection1.retainAll(collection2);
        System.out.println(collection1);

    }

}
