package lesson_11__17_10_24_Null__Continue_01_43.classwork_fromTheTeacher_HW10;
  /*                                     Home Worg 10
                                             Task 2
    Написать метод, принимающий на вход массив строк. Метод должен вернуть массив, состоящий из самой
    короткой и самой длинной строки изначального массива.
    */

import java.util.Arrays;

public class HW10_Task2_FromTheTeache_Null__Continue_01_43min {


    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Python", "JS", "Hello"};
        String[] result = getArrayWithSmallestString(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n--------------------------------------------- Thema nall ---------------------------\n");

        // в этой переменной не хранится ссылка на какой-то объект
        // null - специальное значение для ссылочных типов данных. По сути указывающее на отсутствие значения

        result = null;

        // При запуске программы Sout выходит ошибка - .NullPointerException
        // System.out.println(result.length);
        // System.out.println(result.length); // null.lenght (return) -аварийное завершение программы


        System.out.println("\n ----------------------------------------- testArray = null | lenght = 0 -> ------\n");
        // System.out.println("\n ------------------------------ Проверка метода на null и устранение ошибки ------ \n");


        strings = new String[0]; // Вариант 2 - нам прислали null
        strings = null; // Вариант 1 - нам прислали null
        result = getArrayWithSmallestString(strings);
        System.out.println(Arrays.toString(result));


        System.out.println("\n ---------------------------- null in array (null в массиве) -> ------------------- \n");
        strings = new String[]{"One", "Two", "Python", null, "Hello"}; //    strings = new String[] -  Создание нового массива
        result = getArrayWithSmallestString(strings);
        System.out.println(Arrays.toString(result));


        String strVar = null;
        System.out.println(strVar);// Распечатка строки null
        System.out.println("System.out.println(strVar.length());// Распечатка длины строки null выдает ошибку");

        String strVar1 = "Hello";
        System.out.println(strVar1);
        System.out.println(strVar1.charAt(1));// Распечатка строки "Hello" (один индекс (1))
        System.out.println(strVar1.length());// Распечатка длины строки null выдает ошибку

    }

    public static String[] getArrayWithSmallestString(String[] strings) {


        // String smallesastring = strings[0];//Эта строка выдает ошибку null - как с этим бороться
        // - есть 4 варианта устранить ошибку null


        if (strings == null || strings.length == 0) { // -----01:33 -- Вариант 2 - нам прислали null

            // if (strings == null){ // Вариант 1 - проверка на null - нам прислали null
            //    return null; //  -------- 01:25            Вариант 1
            return new String[0];// [] Вариант 2 - лучший вариант
            //    return  new String[]{"", ""};// Вариант 3 - худший вариант
            //    return new String[]{null, null}; // Вариант 3 - нежелательный вариант

        }

        String smallesastring = strings[0];// Эта строка выдает ошибку null - как с этим бороться

        // System.out.println("\n -------------------------------------------- <- testArray = null ------------------ \n");


        String maximumString = strings[0];



        for (int i = 0; i < strings.length; i++) {

            // при переборе массива   strings = new String[]{"One", "Two", "Python", null, "Hello"}; -  null нам выдает ошибку
            System.out.print(strings[i] + ", ");
            // Вариант 1 - continue
           // 01:43 - if (strings[i] == null) continue;  // continue - завершает текущую операцию цикла (пропускает null в массиве) и переходит к следующей
            //  Вариант 1 - if (strings[i].length() < smallesastring.length()) {

            // Вариант - 2
            // false && ? -> false
            // null != null -> false
            // @2fgf != -> true
            // true && ? -> ?
            if (strings[i] != null && strings[i].length() < smallesastring.length()) {// 01:53
                smallesastring = strings[i];
            }
            if (strings[i] != null && strings[i].length() > maximumString.length()) {
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
   //public static String findFirstNotNullValueInArray(String[] strings){ //02:20
   //    for (int i = 0; i < strings.length; i++) {
   //        if (strings[i] != null ) return strings[i]; // 02:21
   //    }
// Е
   // }
}


