package lesson_10__15_10_24_Return_fori_continue_break.nomeweork;

import java.util.Arrays;

/*                                     Home Worg 10
                                         Task 2
Написать метод, принимающий на вход массив строк. Метод должен вернуть массив, состоящий из самой
короткой и самой длинной строки изначального массива.
*/
public class HW10_Task2_From_The_Teacher {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Python", "JS", "Hello"};
        String[] result = getArrayWithSmallestString(strings);
        System.out.println(Arrays.toString(result));

    }

    public static String[] getArrayWithSmallestString(String[] strings) {
        String smallesastring = strings[0];
        String maximumString = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < smallesastring.length()) {
                smallesastring = strings[i];
            }
            if (strings[i].length() > maximumString.length()) {
                maximumString = strings[i];
            }

        }
        // Первый варианм
        //  String[] res = new  String[2];// Создаем массив на две ячейки для хранения самой короткой и самой длинной строки
        //  res[0] = smallesastring;
        //  res[1] = maximumString;
        //  return res;

        // Второй вариант:  Создаем новый массив, в который булут записаны две строки
        return new String[]{smallesastring, maximumString};

    }
}
