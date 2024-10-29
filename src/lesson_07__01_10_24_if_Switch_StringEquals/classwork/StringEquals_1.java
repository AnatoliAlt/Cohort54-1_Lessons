package lesson_07__01_10_24_if_Switch_StringEquals.classwork;

public class StringEquals_1 {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        boolean b1 = str1 == str2 ;// str1 == str2 - Сравнивается значение ссылок str1 и str2 (адрес ссылки на объект).
        // Адрес "привязанного" одъекта в памяти



        System.out.println("str1 = str2 -> " + b1);// true
        System.out.println("str1 = str3 -> " + (str1 == str3));// false
        System.out.println("str1 = str4 -> " + (str1 == str4));//false
        System.out.println();

        System.out.println("================ Equals ===============================");

        //ВАЖНО!!!
        // - Сравнение строк по значениям делать методом .equals !!!
        // - Для метода .equals имеет значение регистр строк (А - Верхний регистр и а - нижний регистр)

        boolean isEquals = str1.equals(str2);// true
        System.out.println(str1 + ".equals(" + str2 + ") -> " + isEquals);// true
        System.out.println(str1 + ".equals(" + str3 + ") -> " + str1.equals(str3)); // false
        System.out.println(str1 + ".equals(" + str4 + ") -> " + str1.equals(str4)); // true

        System.out.println("================ .equalsIgnoreCase ========================");

        // - .equalsIgnoreCase - игнорирует регистр строк (А - Верхний регистр и а - нижний регистр)
        // и сравнивает значений строк с разными регистрами

        System.out.println(str1 + ".equalsIgnoreCase(" + str4 + ") -> " + str1.equalsIgnoreCase(str3)); // true
        System.out.println();


    }
}

