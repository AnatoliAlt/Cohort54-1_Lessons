package lesson05_IMUTABLE_CONCATENATION_SCANNER.classwork_05_String_IMUTABLE_CONCATENATION;

public class StringExample {
    public static void main(String[] args) {

        String string = "Java"; // Объявление и инициализация переменной типа String

        String string1 = new String("Hello");// То же создание новой строки

        System.out.println("String: " + string);

        // Название метода с круглыми скобками - вызов метода

        System.out.println("string..length(): " + string.length() + " символа в строке Java"); // Количество символов в строке (длина строки). Результат:4 символа

        // Метод позволяет перевести все символы в верхний регистр

        System.out.println("string.toUpperCase: " + string.toUpperCase() + " - Перевести все символы строки в верхний регистр");// Перевести все символы строки в верхний регистр
        System.out.println(string );

        // String - иммутабельна (неизменяемая) ИМУТАБЕЛЬНА
        // Если я хочу сохранить результат работы метода - то должен сохранить его в какую-то переменную
        String string2 = string.toUpperCase();

        // Метод позволяет перевести строки в верхний регистр
        System.out.println("string2: " + string2);
        System.out.println("string: " + string);

        // toLowerCase() - переводит все символы строки в нижний регистр
        string2 = string2.toLowerCase();

        // Перевести все символы строки в нижний регистр
        System.out.println("string2: " + string2 + " - Перевести все символы строки в нижний регистр");

        System.out.println("=========================================");

        System.out.println("____________ 3-и способа склеивания строк__________ ");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // Различные варианты склеивание / объединение строк/ конкатенация строк
        // Конкатенация строк

        System.out.println("_________________ 1-й способ ______________");

        String concatStr = str1 + str2 + str3 + "!!!";
        System.out.println(concatStr);

        System.out.println("_________________ 2-й способ _______________");

        String concatStr2 = str1.concat(str2);// str1 + str2
        System.out.println("concatStr2 (1/2): " + concatStr2 + " пробел");

        concatStr2 = concatStr2.concat(str3);
        System.out.println("concatStr2 (1/2/3): " +  concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3).concat("???");// str1 + str2 + str3 + "???"
        System.out.println(concatStr3);

        System.out.println("___________ 3-й способ ______________");

        String concatStr4 = String.join(" ", str1, str2, str3, "!!!");// Ставится - "" - пробел
        System.out.println("concatStr4: " + concatStr4);

        System.out.println("===========================================");


        System.out.println("_____________ Приведение типов _____________");
        // Приведение типов
        // Когда есть строка - знак плюс конкатенации. И все операнды (участеики операции) преобразуются к строке

        int a = 1;
        int b = 2;
         String string3 = " Hello ";

        System.out.println(string3 + a);

        System.out.println(a + b + string3 + a + b);
        System.out.println(a + b + string3 + "= " + a + b);
        System.out.println(a + b + string3 + "= " + (a + b));

        System.out.println("==========================================");

        System.out.println("_____________ .lenght - ДЛИНА СТРОКИ _______________");
        System.out.println("____ .charAt(0); Выделить символ под индексом (указанным номером) 0 из строки");

        String digits = "0123456789";
        System.out.println("Длина строки = " + digits.length());// Длина строки ровна 10
        String digits2 = "9876543210";

        char firstChar = digits.charAt(0); // Взять символ под индексом (номером) 0 из строки digits
        System.out.println("first from digits: " + firstChar);// Первый символ строки

        char firstChar2 = digits2.charAt(0);
        System.out.println("first from digits2: " + firstChar2);// Первый символ строки

        int length = digits.length();// Длина строки
        // Не зависимо от длины строки, индекс последнего элемента всегда равен минус -1

        char lastChar = digits.charAt(digits.length() -1);
        System.out.println("last from digits: " + lastChar);// индекс последнего элемента строки

        System.out.println("first from digits2: " + digits2.charAt(digits2.length() -1));// Индекс первого элемента строки

        System.out.println("======================================================");// Подстроки


        System.out.println("________ .substring(2); Выделение символов в строке (Подстроки) __________");


        String subString = digits.substring(2); // Выделить подстроку начиная с индекса 2

        System.out.println("digits.substring(2): " + subString + ". Вся строка состоит из 10 символов - 0123456789");//digits.substring(2): 23456789

        System.out.println("- Первоначальная строка остается не измененной: " + "digits = " + digits);

        System.out.println("__________Выделить несолько символов из строки 0123456789 ________________");
        subString = digits.substring(2,7);// Взять подстроку с символа 2 до символа 7 не включительно
        System.out.println("digits.substring(2, 7): " + subString);

        System.out.println("______ Замена всех найденных подстрок ______________");

        String string4 = "OneTwoOneTwoTheree";
        String replase = string4.replace("One", "Stop"); // Заменить все найденные строки "One" на "Stop"
        System.out.println("replase: " + replase);
        // Зезультат: Строка до изменений "OneTwoOneTwoTheree" и ипосле изменений "StopTwoStopTwoTheree"
        // Если не были найдены необходимые символы, то мтрока остается без изменений

        System.out.println("___________ Замена только одной подстроки из всей строки ___________");

        replase = string4.replaceFirst("One", "Stop");
        System.out.println("replaceFirst: " + replase );



    }
}
