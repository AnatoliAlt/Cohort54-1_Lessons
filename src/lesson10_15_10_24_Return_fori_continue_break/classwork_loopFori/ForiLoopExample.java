package lesson10_15_10_24_Return_fori_continue_break.classwork_loopFori;

import java.util.Random;

public class ForiLoopExample {
    public static void main(String[] args) {
        /*
        for () {<Блок инициализации> ; <Блок проверок / условие выхода> ; <Блок изменений>
            тело цикла
        }
        */

        // Вывести все числа от 0 до 10
        int j = 0;
        while (j <= 10) {
            System.out.print(j + ", ");
            j++;
        }
        System.out.println();
        System.out.println("End while loop");

        for (int i = 0; i <= 10; i++) {
            // Выполняем тело цикла
            System.out.print(i + "; ");

        }
        System.out.println();
        System.out.println("End loop foori");
        System.out.println("===============================================");

        // Запустится бесконечный цикл
        // Для цикла for ни один из блоков не явояется обязательным
        // for ( ; ; ){
        //     System.out.println("Hello World");
        // }

        int x = 5;
        for (x = 0; x >= 0; x = x + 1_000_000) {
            System.out.print(x + "; ");
        }
        System.out.println();
        System.out.println("Х после цикла: " + x);
        System.out.println("End N2");

        // В блоке инициализации может быть переменная любого типа

        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.print(str);

            System.out.println("\n=============================================\n");
            // Мы модем инициализировать несколька переменных
            // В блоке изменений мы также можем менять несколько переменных
            // int k = 14;
            // for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++){
            //     System.out.println(k + " : " + a + " : " + f);

            System.out.println("\n===============================================");

            // Создать массив целых чисел случайной длины и в диопазоне от 5 до 15
            // Заполнить массив случайными числами от -50 до 50 включительно

            Random random = new Random();
            int[] ints = new int[random.nextInt(11) + 5]; // Получаем случайную длину
            System.out.println("Длина массива: " + ints.length);

            System.out.println();

            System.out.print(" [");
            for (int i = 0; i < ints.length; i++) {
                ints[i] = random.nextInt(101) - 50;
                System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]"));
                System.out.println();


            }
            System.out.println("\n=============================================\n");

            System.out.println("----------- C O N T I N U E ------- B R E A K -------------");
            System.out.println();
            for (int i = 0; i < 7; i++) {
                if (i == 3) continue;

                System.out.print(i + ", ");

                // continue - прервать текущую интерацию цикла и перейти к следующей -
                // - тоесть в данном случае из цикла удаляется цифра - 3
                // Мы перейдем в блок изменения переменных, потом в блок проверки условий
                // В текущей итерации после вызова continue все операторы в теле цикла будут пропущены
            }
            System.out.println();
            // BREAK - заканчивает текущую интерацию цикла и весь цикл (завершает работу цикла)
            // после вызова BREAK следующие интерации цикла выполнены не будут

            for (int i = 0; i < 7; i++) {
                if (i == 3) break;
                System.out.print(i + ", ");

            }
            System.out.println();

            // continue и break аналогичным образом работают в циклах while
            j = 1;
            while (j < 7) {
                if (j == 3)
                    j++;
                    continue;// break;
            }
            System.out.print(j + "; ");
            System.out.println();
            j++;
        }
        System.out.println("End while");
    }
}

