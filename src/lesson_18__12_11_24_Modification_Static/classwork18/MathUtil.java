package lesson_18__12_11_24_Modification_Static.classwork18;

public class MathUtil {

    public  static  int counter = 0;// Создаем поле объекта
    public static int sumOfIntegers(int x, int... ints) {
        int sum = x;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        MathUtil.counter = counter;
    }
}
