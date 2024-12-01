package lesson07_01_10_24_if_Switch_StringEquals.classwork;

public class BlockExample_2 {
    public static void main(String[] args) {

        /*
        Блок, или составной оператор, — это произвольное количество простых операторов языка Java, заключенных
        в фигурные скобки {}. Блоки определяют область видимости своих переменных. Блоки могут быть вложенными один в другой
         */

        int x = 10;
        {
            int y = 5;
            x = x + y;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        // x = x + y; // ошибка компиляции. Переменная Y невидна (не доступна) вне своего блока.


    }
}
