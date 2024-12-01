package lesson07_01_10_24_if_Switch_StringEquals.classwork;

import java.util.Random;

public class MinimumValue_5_Random {
    public static void main(String[] args) {

        System.out.println("================ Поиск минимального значения ============");

        Random random = new Random();

        int v1 = random.nextInt(51);
        int v2 = random.nextInt(51);
        int v3 = random.nextInt(51);

        System.out.println(v1 + " | " + v2 + " | " + v3);

        int min = v1;

        if (v2 < min){
            min = v2;
        }
        if (v3 < min)min = v3;

        System.out.println("Минимальное значение: " + min);
    }
}
