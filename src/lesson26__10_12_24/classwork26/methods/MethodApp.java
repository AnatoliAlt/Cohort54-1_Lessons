package lesson26__10_12_24.classwork26.methods;

import java.util.Arrays;

public class MethodApp {
    public static void main(String[] args) {

        // Толька ссылочные типы данных
        // С примитивными типами, GENERIC работать не будет
        Integer[] intergers = {1, 2, 3, 4, 5, 6};
        System.out.println("Arrays.toString(intergers): " + Arrays.toString(intergers));

        String str = UtilsGeneric.printArray(intergers);
        System.out.println("String str: " + str);

        String[] strings = {"a", "b", "c", "d"};
        String str1 = UtilsGeneric.printArray(strings);
        System.out.println(" String str1: " + str1);

        System.out.println("=====================================");

        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};
        String str2 = UtilsGeneric.printArray(doubles);
        System.out.println(" String str2: " + str2);


        UtilsGeneric.swap(doubles, 0, 3);
        System.out.println(" UtilsGeneric.swap (String str2): " + UtilsGeneric.printArray(doubles));

        double sum = UtilsGeneric.sum(intergers);
        System.out.println("double sum: " + sum);

        sum = UtilsGeneric.sum(doubles);
        System.out.println(sum);
    }
}
