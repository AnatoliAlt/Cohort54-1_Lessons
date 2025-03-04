package lesson38__13_02_25_Interface_List_Set.homework38;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
                                     Task 2
Создайте два множества строк (Set<String>), каждое из которых будет заполнено различными словами. Некоторые
слова должны повторяться в обоих множествах.
------------
Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество, содержащее
все уникальные элементы из обоих множеств (объединение множеств).

Реализуйте метод intersection(Set<String> set1, Set<String> set2), который возвращает
множество, содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).

Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает
множество элементов, которые есть в первом множестве, но отсутствуют во втором (разность множеств).

Результат каждого метода необходимо выводить в консоль для наглядности.
Следует обеспечить, чтобы в исходных множествах были как уникальные, так и общие элементы
для наглядности результатов операций.
-------------------------
Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

System.out.println(SetUtils.union(set1, set2));
System.out.println(SetUtils.intersection(set1, set2));
System.out.println(SetUtils.difference(set1, set2));

// Output:
[A, B, C, D, E, F]
[C, D]
[A, B]
 */
public class HW38_Task2 {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println(union(set1, set2));
        System.out.println();
        System.out.println(intersection(set1, set2));
        System.out.println();
        System.out.println(difference(set1, set2));
        System.out.println(difference2(set1, set2));
    }
    // Метод удаления повторений и объединения множеств.
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    // Пересечение множеств в строках
    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
    // Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает
    // множество элементов, которые есть в первом множестве, но отсутствуют во втором (разность множеств).
    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }
    public static Set<String> difference2(Set<String> set1, Set<String> set2) {
        Set<String> differenceSet2 = new HashSet<>(set2);
        differenceSet2.removeAll(set1);

        return differenceSet2;
    }


}
