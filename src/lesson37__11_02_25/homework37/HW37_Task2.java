package lesson37__11_02_25.homework37;
/*                      Home Work 37
                          Task 2
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.

Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

Создайте 4 метода, принимающий реализацию интерфейса List.

В первом методе - получение всех значений элементов списка по его индексу
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.

И сравните время последовательного выполнения всех методов для каждой реализации List-а.

Пример метода, который измеряет время выполнения некоторого кода и возвращает его в миллисекундах:

Пример метода
public class TimerExample {
    public static void main(String[] args) {
        // Измеряем и выводим время выполнения метода someMethod
        long duration = someMethod();
        System.out.println("Время выполнения метода: " + duration + " миллисекунд");
    }

    private static long someMethod() {
        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();

        // Тело метода


        // Засекаем время окончания выполнения
        long endTime = System.currentTimeMillis();

        // Возвращаем разницу во времени в миллисекундах
        return endTime - startTime;
    }
}
Copy
Объяснение кода
Метод someMethod:
В начале метода фиксируем текущее время с помощью System.currentTimeMillis(), чтобы определить время начала выполнения (startTime).
В теле метода выполняем нужные операции.
В конце метода фиксируем текущее время еще раз, чтобы определить время окончания выполнения (endTime).
Возвращаем разницу между временем окончания и началом выполнения, что дает нам время выполнения метода в миллисекундах.
 */
public class HW37_Task2 {
}
