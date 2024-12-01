package lesson03_peremennie_tipydannih.homework_03;
/*
Task 3 * (Опционально)
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).

Вычислите среднюю температуру за неделю и выведете ее на печать.
 */

public class HW_Task_3_Temperature {
    public static void main(String[] args) {


        int mo = 23;// Monday - Понедельник
        double tu = 23.8;// Tuesday - Вторник
        int we = 23;// Wednesday - Среда
        double thu = 22.5;// Thursday - Четверг
        int fr = 20;// Friday - Пятница
        double sa = 18.3;// Saturday - Суббота
        int su = 18;// Sunday - Воскресенье

        // Todo - Служит для заметок

        double generalTemperature = mo + tu + we + thu + fr + sa + su;
        System.out.println("General temperature - " + generalTemperature + " (Общая температура.)");// Общая температура.

        double averageTemperature = generalTemperature / 2;// Средняя температура
        System.out.println("Average temperature - " + averageTemperature + " (Средняя температура)");
        System.out.printf("Average temperature - %.3f\n" , averageTemperature);

        double averageTemperaturePerDay = generalTemperature / 7;// Средняя температура в день.
        System.out.println("Average temperature per day - " + averageTemperaturePerDay + " (Средняя температура в день)");
        System.out.printf("Average temperature per day - %.2f\n " , averageTemperaturePerDay);

    }
}
