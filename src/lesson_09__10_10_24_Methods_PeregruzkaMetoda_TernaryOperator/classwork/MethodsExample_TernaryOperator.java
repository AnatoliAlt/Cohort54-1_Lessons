package lesson_09__10_10_24_Methods_PeregruzkaMetoda_TernaryOperator.classwork;

import java.util.Random;

public class MethodsExample_TernaryOperator {
    public static void main(String[] args) {

        //  System.out.println("Hello World");
        //  System.out.println("Hello World");
        //  System.out.println("Hello World");
        //  System.out.println("Hello World");

        sayHello();// Вызываем метод - public static void sayHello(){ этот метод можно вызвать много раз
        sayHello();// Вызываем метод - public static void sayHello(){
        sayHello();// Вызываем метод - public static void sayHello(){
        System.out.println("-------------------------------");
        String string = "Java";
        System.out.println("Длина строки - Java: " + string.length() + " символа");
        System.out.println("-----------------------------");

        printChar(string);// Распечатываем на кансоли
        System.out.println("-------------------------------");

        printChar("python!!!");// Распечатываем на кансоли
        System.out.println("------------------------------");

        char ch = 'A';
        printDecimalCodeOfChar(ch); // Распечатываем на кансоли
        printDecimalCodeOfChar('d');
        printDecimalCodeOfChar('C');
        System.out.println("-----------------------------------");

        int[] array = {1, 45, 56, 85, 852, 97, 64, 27};// Инициализация массива
        printArray(array);

        array[3] = 1001;
        array[0] = 100000;
        printArray(array);

        int[] array2 = {1, 2, 78, 999, 4, 3, -999, 88};
        printArray(array2);
        System.out.println("----------------------------------");

        /*
        ++++++++ ПЕРЕГРУЗКА МЕТОДОВ +++++++++++++++**
        В пределах одного класса может быть два и более методов с одинаковым именем
        но разным набором параметров.
        Порядок параметров имеет значение - (int x, String str) или (String str, int x) - это два разных параметра

        (String[] strings) { - Называется "Сигнатура метода" (надор параметров метода)
         */

        String[] strings = {"Java", "Python", "Hello", "World"};
        printArray(strings);
        System.out.println("---------------------------------------");
        System.out.println("------- Перегружаем метод printNumbers ---------");

        // Написать метод, который выводит в консоль числа от 1 до N
        printNumbers(6);

        // Написать метод, который выводит в консоль числа от x до y
        printNumbers(3, 8);

        printNumbers("Java", 3);
        printNumbers(100, "Python!");

        System.out.println("------------- МЕТОД 6 (changeMe) ---------------");
        int temp = 55;
        changeMe(temp);
        System.out.println(temp);

        int[] arr = {1, 2, 3, 4, 5};
        changeMe(arr);
        printArray(arr);
        //System.out.println(arr);

        String java = "Java";
        changeMe(java);
        System.out.println(java);

        System.out.println("-------------------------------");
        System.out.println("---------- Random --------------");
        int[] arr2 = new int[10];
        printArray(arr2);
        fillArrayWithRandom(arr2, 101);
        printArray(arr2);
        System.out.println("--------------------------------");

    }
    public static void fillArrayWithRandom(int[] array, int bound){
        System.out.println(" ---------- Random ----------");
        Random random = new Random();
        int i = 0;
        while (i < array.length){
            array[i] = random.nextInt(bound);
            i++;

        }
    }

    public static void changeMe(int x) {
        System.out.println("------------- 6 МЕТОД changeMe ---------------");
        x = 100;

    }
    public static void  changeMe(int[] array){
        System.out.println("------------- 6.1 ПЕРЕГРУЗКА МЕТОДA changeMe ---------------");
        array[0] = 100_000_000;

    }
    public static void changeMe(String str){
        System.out.println("------------- 6.2 ПЕРЕГРУЗКА МЕТОДA changeMe ---------------");
        str = str + "!!!";
        System.out.println("-------------------------------------------------------------");
    }


    public static void printNumbers(int numbers) {
        int i = 1;
        while (i <= numbers) {
            System.out.print(i + ", ");
            i++;
        }
        System.out.println();
    }

    public static void printNumbers(int x, int y) {
        int i = x;
        while (i <= y) {
            System.out.print(i + ", ");
            i++;
        }
        System.out.println();
    }

    public static void printNumbers(int x, String str) {
        System.out.println("Option 1!");
    }

    public static void printNumbers(String str, int x) {
        System.out.println("Option 2!");
    }


    public static void printArray(String[] strings) {
        System.out.println("--------------------------------------");
        System.out.print("[");
        int i = 0;
        while (i < strings.length) {
            System.out.print(strings[i] + (i < strings.length - 1 ? ", " : "]\n "));
            i++;
        }
    }

    public static void printArray(int[] array) {
        System.out.println("------ Метод который красиво выводит массив в консоль ----------------");
        System.out.print("[");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : "]\n "));
            i++;
        }
    }

    // Метод который выводит на экран десятичный код символа
    public static void printDecimalCodeOfChar(char ch) {
        System.out.println((int) ch);
    }

    // Распечатать все символы стпоки в отдетьной строке
    public static void printChar(String str) {
        System.out.println("Переменная в методе: " + str);
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            System.out.println(ch);
            i++;
        }
    }

    public static void printPython(String rts) {
        System.out.println("Переменная в методе: " + rts);// распечатываем -  printChar("python!!!");
        int i = 0;
        while (i < rts.length()) {
            char ch = rts.charAt(i);
            System.out.println(ch);
            i++;
        }
    }

    // Метод без возвращаемого значения (void = метод)
    public static void sayHello() {
        // Тело метода
        System.out.println("Hello World");
    }
}
