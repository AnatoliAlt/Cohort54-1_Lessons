package lesson06_Boolean_Random_StringEquals.classwork_06;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // Введите или четное число, или число, которое делится на 5 без остатка.
        // Четное число - это число, которое делится на 2 без остатка. Остаток от деления числа на 2 равен 0

        // Генерация случайных чисел (псевдо случайного числа)

        // System.out.println("____  Смотреть CLASS Bolean Example");
        System.out.println("_____________ RANDOM __________________________________-");

        // Генерация случайных чисел (псевдо случайного числа)
        Random random = new Random();
        int rand = random.nextInt(101);// (0 .... 101) -> (0 .... 100) включительно
        System.out.println("Случайное число: " + rand);

        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = isEven | (rand % 5 == 0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGoodNumber: " + isGoodNumber);

        //  ____ или как вариант

        boolean isGoodNumber1 = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGoodNumber: " + isGoodNumber1);
    }
}
