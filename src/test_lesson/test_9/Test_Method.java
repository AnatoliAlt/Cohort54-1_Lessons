package test_lesson.test_9;

public class Test_Method {
    public static void main(String[] args) {

        String string = "Mamaa";
        System.out.println(string);
        papa(string);
        char ch = 'A';
        printChar(ch);
        printChar('d');


    }
    public static void papa(String str){
        System.out.println("mama " + str);
        System.out.println("Длина строки Mama: " + str.length() + " символов!");
        System.out.print("(");
        int i = 0;
        while (i < str.length()){
            char ch = str.charAt(i);
            System.out.print(ch);
            System.out.print(i != str.length() -1 ? ", " : ")\n");
            i++;
        }
    }
    // Выводим на кансоль десятичный код символа 'A' - char
    public static void printChar(char ch){
        System.out.println("Десятичный код символа: " + ch + " - " + (int) ch);
    }
}
