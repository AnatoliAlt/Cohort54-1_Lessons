package lesson_05_IMUTABLE_CONCATENATION_SCANNER.classwork_05_String_IMUTABLE_CONCATENATION;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // Подготовка программы к чтению данных от пользователя

        Scanner scanner = new Scanner(System.in);
        // Спросить имя
        System.out.println("Введите Ваше имя: ");
        String name = scanner.nextLine();
        System.out.println(name + 1);
        // Спросить возраст
        System.out.println("Введите Ваш возраст");
        int age = scanner.nextInt();// Tocken - 1 tocken 18, 2 tocken 555, 3 tocken 666
        scanner.nextLine();// Обнулить сканер или удалить ненужные нам данные
        System.out.println(age + 1);

        // Введите кол-во детей
        System.out.println("Введите кол-во детей: ");
        int children = scanner.nextInt();
        scanner.nextLine();// Обнулить сканер или удалить ненужные нам данные
        System.out.println(children);

        // Мы можем получить double
        System.out.println("Введите double: ");
        double doudleVar = scanner.nextDouble();
        System.out.println(doudleVar);
    }
}
