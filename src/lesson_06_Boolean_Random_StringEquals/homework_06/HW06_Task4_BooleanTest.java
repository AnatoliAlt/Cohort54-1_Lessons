package lesson_06_Boolean_Random_StringEquals.homework_06;
/*
Task 4
Дан следующий код. Вашей задачей является предсказать, какой
вывод будет напечатан в консоли после выполнения программы.

public class BooleanTest {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);
    }
}
Copy
Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.
 */

public class HW06_Task4_BooleanTest {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;


        result = (a + b) > 10; // result = true
        System.out.println("Result 1 - (a + b) > 10: " + result);

        result = (a - b) == 5;  // result = true
        System.out.println("Result 2 - (a - b) == 5: " + result);

        result = (a * b) != 24;  // result = false
        System.out.println("Result 3 - (a * b) != 24: " + result);

        result = (a / b) >= 2;  // result = true
        System.out.println("Result 4 - (a / b) >= 2: " + result);

        result = !(a % b == 2);  // result = false
        System.out.println("Result 5 - result = !(a % b == 2): " + result);
    }
}
