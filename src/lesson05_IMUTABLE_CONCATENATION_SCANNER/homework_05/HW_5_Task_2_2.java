package lesson05_IMUTABLE_CONCATENATION_SCANNER.homework_05;

/*
Task 2.2 * (Опционально)
Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
 */
public class HW_5_Task_2_2 {
    public static void main(String[] args) {

        // Строка: - Java is a powerful language! -
        String str1 = "Java";
        String str2 = " ";
        String str3 = "is";
        String str4 = "a";
        String str5 = "powerful";
        String str6 = "language";
        String str7 = "!";

        // Конкатинация строки
        String concatStr1 = str1 + str2 + str3 + str2 + str4 + str2 + str5 + str2 + str6 + str7;
        System.out.println("String concatenation: " + concatStr1);

        // Замена в строке слово "powerful" на "super"
        String string = concatStr1;
        String replaceSubstr = string.replace("powerful", "super");
        System.out.println("Замена в строке - Java is a powerful language! - слово powerful на super");
        System.out.println("replaceSubstr: " + replaceSubstr);

        // Создать переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
        boolean strAge = replaceSubstr.contains("age");
        System.out.println("Строка содержит подстроку  - age -: " + strAge) ;


    }
}
