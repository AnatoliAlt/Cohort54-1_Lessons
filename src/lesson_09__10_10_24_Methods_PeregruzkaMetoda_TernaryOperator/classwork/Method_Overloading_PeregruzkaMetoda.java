package lesson_09__10_10_24_Methods_PeregruzkaMetoda_TernaryOperator.classwork;

import java.util.Random;

public class Method_Overloading_PeregruzkaMetoda {
    /*
       ++++++++ ПЕРЕГРУЗКА МЕТОДОВ +++++++++++++++**
       В пределах одного класса может быть два и более методов с одинаковым именем
       но разным набором параметров.
       Порядок параметров имеет значение - (int x, String str) или (String str, int x) - это два разных параметра

       (String[] strings) { - Называется "Сигнатура метода" (надор параметров метода)
        */
    public static void main(String[] args) {

        System.out.println("------------- ПЕРЕГРУЗКА МЕТОДA changeMe ---------------");

        String[] strings = {"Java", "Python", "Hello", "World"};
        printArray(strings);

        // Написать метод корый выводит на консоль числа от 1 до n
        printNumber(6);

        // Написать метод который выводит на кансоль числа от X до Y
        printNumber(3, 8);

        printNumber("Java", 3);

        printNumber(3, "Java");

        int temp = 55;
        changeMe(temp);
        System.out.println("changeMe(int x): " + temp);

        int[] arr = {1, 2, 3, 4, 5,};
        changeMe(arr);
        printArray(arr);

        String java = "Java";
        changeMe(java);
        System.out.println(java);
        // System.out.println( Random );
        int[] arr2 = new int[10];
        printArray(arr2);
        fillArrayWithRandom(arr2, 101);
        printArray(arr2);



    }
    public static void fillArrayWithRandom(int[] array, int bound) {
        System.out.println(" ---------- Random ----------");
        Random rand = new Random();
        int i = 0;
        while (i < array.length){
            array[i] = rand.nextInt(bound);
            i++;
        }
        System.out.println();
    }

    public static void changeMe(int x) {
        x = 100;

        System.out.println();

    }

    public static void changeMe(int[] array) {
        array[0] = 100_000_000;
        System.out.println();
    }

    public static void changeMe(String str) {
        str = str + "!!!";
        System.out.println();
    }
    public static void printArray(String[] strings) {
        System.out.println("------ Метод который красиво выводит массив String в консоль ----------------");
        System.out.print("[");
        int i = 0;
        while (i < strings.length) {
            System.out.print(strings[i] + (i < strings.length - 1 ? ", " : "]\n "));
            i++;
        }
        System.out.println();
    }


    public static void printArray(int[] array) {
        System.out.println("------ Метод который красиво выводит массив в консоль ----------------");
        System.out.print("[");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : "]\n "));
            i++;
        }
        System.out.println();
    }

    // Написать метод корый выводит на консоль числа от1 до 4
    public static void printNumber(int number) {
        int i = 1;
        while (i <= number) {
            System.out.print(i + ",");
            i++;
        }
        System.out.println("\n------------------------");
    }

    public static void printNumber(int x, int y) {
        int i = x;
        while (i <= y) {
            System.out.print(i + ",");
            i++;
        }
        System.out.println();
    }

    public static void printNumber(int x, String str) {
        System.out.println("Option 1!!!");
        System.out.println();
    }

    public static void printNumber(String str, int x) {
        System.out.println("Option 2!!!");
        System.out.println();
    }

}
