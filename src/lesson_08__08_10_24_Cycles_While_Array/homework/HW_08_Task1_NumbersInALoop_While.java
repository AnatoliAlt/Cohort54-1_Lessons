package lesson_08__08_10_24_Cycles_While_Array.homework;

/*                             Home Work 8
                                  Task 1
Найдите произведение всех чисел от 1 до 10 включительно.

Результат выведите на экран
 */
public class HW_08_Task1_NumbersInALoop_While {
    public static void main(String[] args) {

        int sum = 1;
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " | ");
            sum = sum * i;
            i++;
        }
        System.out.println("\n Derivative of numbers from 0 to 10 = " + sum);// Производная чисел от 0 до 10
        System.out.println("================================================================");
    }
}
