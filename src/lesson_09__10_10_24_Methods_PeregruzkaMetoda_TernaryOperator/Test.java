package lesson_09__10_10_24_Methods_PeregruzkaMetoda_TernaryOperator;

public class Test {
    public static void main(String[] args) {


        String string = "Mama";
        System.out.println(string);
        char ch = 'A';
        //System.out.println("Длина строки: " + string.length());
        //System.out.println("------------------------\n");

        papa(string);
        System.out.print("\n------------------------\n");

        papa("mama");
        System.out.println("\n------------------------\n");

        papa("python");
        System.out.println("\n------------------------\n");

        papa("3");
        System.out.println("\n------------------------\n");

        papa("Auto");
        System.out.println("\n------------------------\n");

        printChar(ch);
        printChar('d');
        System.out.println("\n------------------------\n");
    }

    public static void papa(String str) {
        System.out.println("mamaa ");
        System.out.println("mama - " + str);
        System.out.println("Длина строки: " + str.length());
        System.out.print("(");
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            System.out.print(ch);
            System.out.print(i != str.length() -1? ", " : ")");
            i++;

        }
    }
    // Выводим на кансоль десятичный код символа 'A' - char
    public static void printChar(char ch){
        System.out.println("Десятичный код символа - " + (int) ch);

    }
}
