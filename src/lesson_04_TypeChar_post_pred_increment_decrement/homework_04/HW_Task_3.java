package lesson_04_TypeChar_post_pred_increment_decrement.homework_04;
/*
Task 3 * (Опционально)
Потеря данных при преобразовании
Напишите программу, которая:

Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
Выводит значение smallNumber на экран.
Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.
 */
public class HW_Task_3 {
    public static void main(String[] args) {

        // Явное преобразование

        long bigNumber = 15_000_000_000L;
        int smallNumber = (int) bigNumber;

        System.out.println("Value smallNumber: " + smallNumber);

        /*
        Результат отличается от ожидаемого по причине обьема ячеек для хранения данных.
        Объем памяти long - 8 byte или 64 bit
        Одьем памяти int - 4 byte или 32 bit
        В этом случае JAVA выдает нам результат который она может прокастить. Поэтому происходит потеря данных.
         */
    }
}
