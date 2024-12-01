package lesson05_IMUTABLE_CONCATENATION_SCANNER.homework_05;
/*
Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
 */
public class HW_5_Task2_StringJavaConcatenation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = " ";
        String str3 = "is";
        String str4 = "a";
        String str5 = "powerful";
        String str6 = "language";
        String str7 = "!";

        System.out.println("String concatenation: " + str1 + str2 + str3 + str2 + str4 + str2 + str5 + str2 + str6 + str7);

        // Конкатинация строки первым способом
        String concatStr1 = str1 + str2 + str3 + str2 + str4 + str2 + str5 + str2 + str6 + str7;
        System.out.println("String concatenation the first way: " + concatStr1);

        // Конкатинация строки вторым способом
        String concatStr2 = str1.concat(str2)
                .concat(str3)
                .concat(str2).concat(str4).concat(str2).concat(str5).concat(str2).concat(str6).concat(str7);
        System.out.println("String concatenation the second way: " + concatStr2);

        // Длина строки - Java is a powerful language! -
        String strLeng = concatStr1;
        System.out.println("Длина строки - Java is a powerful language! - " + strLeng.length() + " символов");

    }
}
