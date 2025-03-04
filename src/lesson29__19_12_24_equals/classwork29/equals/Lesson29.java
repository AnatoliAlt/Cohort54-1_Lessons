package lesson29__19_12_24_equals.classwork29.equals;

import java.util.Objects;

public class Lesson29 {
    public static void main(String[] args) {

        String s1 = "Java"; // true
        String s2 = "Java"; // false
        String s3 = new String("Java"); // true

        System.out.println("=============     1 )            =========================");

        System.out.println(s1 == s2); // true  Сраунивается ссылки
        System.out.println(s1 == s3); // false Сраунивается ссылки
        System.out.println(s1.equals(s2)); // true Сравнение строк по значению
        System.out.println(s1.equals(s3)); // true Сравнение строк по значению

        System.out.println("=======   2 )   ======================");

        Employee employee = new Employee("Max", "Ivanov", 25);
        Employee employee1 = new Employee("max", "Ivanov", 25);
        Employee employee2 = new Employee("Peter", "Petrov", 33);
        Employee employee3 = new Employee("Peter", "Petrov", 55);
        Employee employee4 = new Employee("Max", "Ivanov", 25);

        System.out.println(employee2 == employee1); // false    Сраунивается ссылки
        System.out.println(employee == employee4); // false   Сраунивается ссылки
        System.out.println(employee.equals(employee1)); // false  Сравнение строк по значению
        System.out.println(employee.equals(employee3)); // false  Сравнение строк по значению
        System.out.println(employee.equals(employee4)); // true  Сравнение строк по значению

        System.out.println("===========       3 )          =================");

        System.out.println(employee.equals(employee4)); // true
        System.out.println(employee.equals(employee1)); // false
        System.out.println(employee2.equals(employee3)); // false

        System.out.println("============      4 )        =========================");
        Employee nullEmploee = new Employee(null, null, 0);
        Employee nullEmploee1 = new Employee(null, null, 0);
        System.out.println(nullEmploee.equals(nullEmploee1)); // Результат: true
        System.out.println(Objects.equals(null, null));  // Результат: true; null равен null - true

    }
}
