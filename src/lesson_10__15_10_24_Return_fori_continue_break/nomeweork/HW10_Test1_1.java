package lesson_10__15_10_24_Return_fori_continue_break.nomeweork;
/*                                     Home Worg 10
                                         Task 2
Написать метод, принимающий на вход массив строк. Метод должен вернуть массив, состоящий из самой
короткой и самой длинной строки изначального массива.
// getArrayWithSmallestString
// smallesastring
*/


import java.util.Arrays;

public class HW10_Test1_1 {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Python", "JS", "Hello"};
        String[] result = getArrayWithSmallestString(strings);
        System.out.println(Arrays.toString(result));
    }
    public static String[] getArrayWithSmallestString(String[] strings){
        String smallesastring = strings[0];
        String maximumString = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < smallesastring.length()){
                smallesastring = strings[i];
            }
            if (strings[i].length() > maximumString.length()){
                maximumString = strings[i];
            }

        }
        return new String[]{smallesastring, maximumString};
    }
}

