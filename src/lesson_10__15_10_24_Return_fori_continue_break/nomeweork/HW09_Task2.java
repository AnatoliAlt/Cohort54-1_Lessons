package lesson_10__15_10_24_Return_fori_continue_break.nomeweork;

/*                         Home Work 9
                              Task 2
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)
класс Math для нахождения степени числа использовать нельзя ;)
*/
public class HW09_Task2 {
    public static void main(String[] args) {


        // method area
        int pow = -4;
        // pow = 10;
        // pow = -3;
        powTwo(pow);
    }

    public static void powTwo(int n) {
        // 2 в степени 3 = 2 ^ 3 = 2 * 2 * 2 = 8
        // 2 в степени 0 = 1

        // Запоминаю, пришла изначально положительная степень или отрицательная
        boolean ispositive = n >= 0;
        // тернарный оператор
        //n = (ispositive) ? n : n * -1;
        // или другой вариант
        // Если число НЕ положительное то сделать его положительным
        if (!ispositive) n *= -1;// n = n * -1

        int result = 1; // 2 в степени 3 - 2 ^ 3 = 1 * 2 * 2 * 2 = 8
        for (int i = 0; i < n; i++) {
            result *= 2;

        }
        if (ispositive) {
            System.out.println("Два в степени n ");
            System.out.println("n = " + n);
            System.out.printf("2 ^ %d = %d", n, result);
        } else {
            System.out.println("Два в степени n ");
            System.out.println("n = " + n);
            System.out.printf("2 ^ %d = %.4f", n, 1.0 / result);
        }
        //System.out.println("Два в степени n ");
        //System.out.println("n = " + n);
        //System.out.println("2 ^ %d = %d\n" + result);


    }
}
