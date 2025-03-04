package lesson38__13_02_25_Interface_List_Set.homework38;
/*
                                     Task 3
Опционально
Написать метод, возвращающий первый неповторяющийся символ в строке

public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(StrUtil.getFirstUniqueChar(string));
    }
    //Output:
    e
   */


public class HW38_Task3_Optional {
    public static void main(String[] args) {
        String string = "AAAabcdefj ab,cdf,";
        System.out.println("Строка: " + string);

        // Удаление всех символов кроме букв и цифр
        String Str = string.replaceAll("[^a-zA-Z0-9а-яА-Я]", "");
        System.out.println(Str);

        System.out.println("==============");

        int[] charCounts = new int[Character.MAX_VALUE];

        for (char ch : Str.toCharArray()) { // toCharArray() используется для преобразования строки в массив символов (char[])
            charCounts[ch]++;

        }
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] == 1) {

                System.out.println("Первый неповторяющийся символ в строке: " + (char) i);
                return;


            }

        }
    }
}