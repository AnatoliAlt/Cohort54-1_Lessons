package lesson10_15_10_24_Return_fori_continue_break.nomeweork;
/*
Task 2
Написать метод, принимающий на вход массив строк. Метод должен вернуть массив, состоящий из самой
короткой и самой длинной строки изначального массива.
 */
public class HW10_Task2 {
    public static void main(String[] args) {

    }
    public static String[] getArrayWithSmallestStrings(String[] strings) {
        String smallestString = strings[0];
        String maximumString = strings[0];

        for (int i = 0; i < strings.length; i++) {
            // if (min < arr[i])
            if (strings[i].length() < smallestString.length()) {
                smallestString = strings[i];
            }

            if (strings[i].length() > maximumString.length()) {
                maximumString = strings[i];
            }
        }

        // Создаем новый массив, в который будут записаны две строки
        return new String[] {smallestString, maximumString};
    }

}
