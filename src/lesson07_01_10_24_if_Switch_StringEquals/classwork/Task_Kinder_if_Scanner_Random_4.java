package lesson07_01_10_24_if_Switch_StringEquals.classwork;

import java.util.Random;
import java.util.Scanner;

public class Task_Kinder_if_Scanner_Random_4 {
    public static void main(String[] args) {
        int mone = 100;
        int kind;


        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        kind = random.nextInt(5) + 1;
        System.out.println("Введите оценку за работу в школе: " + kind);
        //int number = scanner.nextInt();
        //scanner.nextLine();

        if (kind >= 5) {
            System.out.println("За отметку " + kind + ": приз 20 денег");
            mone +=20;
        }else if (kind == 4){
            System.out.println("За отметку  " + kind + ": приз 10 денег");
            mone += 10;
        }else if (kind == 3){
            System.out.println("За отметку " + kind + ": 0 денег");
            mone += 0;
        }else if (kind == 2){
            System.out.println("За отметку " + kind + ": -10 денег");
            mone -= 10;
        }else if (kind == 1){
            System.out.println("За отметку " + kind + ": забирают все деньеги");

        }else {
            System.out.println("Таких отметок не бывает");
        }
        System.out.println("У ребенка сейчас денег: " + mone);

        System.out.println("==================================================");

        int money = 100;
        int note;

        System.out.println("_____________________ Решение от учителя _________________");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку за работу в школе: ");
        note = scanner.nextInt();
        scanner.nextLine();


        if (note == 5) {
            System.out.println(money += 20);  // money + money + 20
        }else if (note == 4){
            System.out.println(money += 10);
            //      } else if (note == 3){
            //          System.out.println(money += 0);
        }else if (note == 2){
            System.out.println(money -=10);
        }else if (note == 1){
            System.out.println(money + ": забирают все деньеги");
            mone =0;
        }else {
            System.out.println("Таких отметок не бывает");
        }
        System.out.println("У ребенка сейчас денег: " + money);


    }
}

