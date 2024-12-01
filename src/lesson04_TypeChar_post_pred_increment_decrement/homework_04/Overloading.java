package lesson04_TypeChar_post_pred_increment_decrement.homework_04;

public class Overloading {
    public static void main(String[] args) {

        byte b1 = 127;
        b1 += 5;
        System.out.println("b1: " + b1);// результат: -124

        b1--;
        System.out.println("b1: " + b1);// результат: -125

        byte b2 = -128;
        b2 -= 4;
        System.out.println("b2: " + b2);// результат: 124

        short s1 = 32760; // результат:
        s1--;
        System.out.println("s1: " + s1);// результат: 32759
        s1++;
        System.out.println("s1: " + s1);// результат: 32760
        s1 += 8;
        System.out.println("s1: " + s1);// результат: -32768

    }
}
