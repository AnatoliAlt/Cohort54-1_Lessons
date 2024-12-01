package lesson04_TypeChar_post_pred_increment_decrement.classwork_04;

public class IncrementExample {
    public static void main(String[] args) {

        int var = 5;
        System.out.println("var: " + var);

        var = var + 10;
        System.out.println("var: " + var);// Обновляем значение переменной var + старое значение var = 5

        var += 2;// var = var + 2 // Укороченноая форма записи +=
        System.out.println("var: " + var);

        var -= 2;// var = var - 2
        System.out.println("var: " + var);// Укороченноая форма записи -=

        var *= 2;// var = var * 2
        System.out.println("var: " + var);// Укороченноая форма записи *=

        var /= 2;// var = var / 2
        System.out.println("var: " + var);// Укороченноая форма записи /=

        System.out.println("=========================");

        // TODO - Инкремент var++, Декремент var--
        var++; // var = var + 1; var += 1; // Увеличить текущее значение на 1 // Инкремент var++
        System.out.println("Увеличить текущее значение var на 1 " + var); // // //  Инкремент var++

        var--; // var = var - 1; var -= 1; // Уменшить текущее значение на 1 // // //   Декремент var--
        System.out.println("Уменшить текущее значение var на 1" + var);// Декремент var--


        // TODO -  Постинкремент, прединкремент
        int x =100;
        System.out.println("x = " + x++);         // Постинкремент
        System.out.println("x = " + x);

// Постинкремент, прединкремент
        int y = 100;
        System.out.println("y = " + ++y);           // Прединкремент
        System.out.println("y = " + y);
    }
}
