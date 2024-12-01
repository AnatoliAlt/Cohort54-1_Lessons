package lesson08_08_10_24_Cycles_While_Array.homework;
/*                               Home Work 8
                                    Task 2
Используйте цикл while для решения задачи:

Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
 */

public class HW_08_Task2_While {
    public static void main(String[] args) {
        int str = 1;
        while (str <= 10){
            System.out.print("Task " + str++ + " | ");

        }
    }
}
