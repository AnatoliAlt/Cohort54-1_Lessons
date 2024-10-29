package lesson_08__08_10_24_Cycles_While_Array.homework;
/*                     Home Work 8
                           Task 3
Используйте цикл while для решения задачи:

Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
 */

public class HW_08_Task3_DivisionOfNumbers_While {
    public static void main(String[] args) {
        int sum = 1;
        while (sum <= 100){
            if (sum % 5 == 0){
                System.out.print("| " + sum + " % 5,\n");
            }
            sum++;
            //System.out.println("- " + sum);
        }
    }
}
