package lesson06_Boolean_Random_StringEquals.homework_06;
/*
Task 1
Дан текст Programming is fun.

Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, и выведите результат в виде булевой переменной.
 */

public class HW6_Task1_StringFun {
    public static void main(String[] args) {

        String str = "Programming is fun";
        //String string = str;
        boolean strFun = str.contains("fun");
        System.out.println("Строка - Programming is fun - содержит слово - fun -: " + strFun);


    }
}
