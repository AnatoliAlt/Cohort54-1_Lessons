package lesson_18__12_11_24_Modification_Static.classwork18;

public class FinalDemo {
    // Для примитивных типов данных, помеченных как final
    // После инициализации (присвоения первого значения) - изменить значения в переменной нельзя
    private final int capasity = 10;// Примитивные типы данных

    // Ссылочные типы данных. Нельзя изменить значение переменной (привязать новый объект)
    private final int[] ints = new int[capasity];// Ссылочные типы данных
    private int notFinal;

    private FinalDemo(int capasity) {
        // Нельзя поменять значения final переменной
        // this.capasity = capasity;

        // Нельзя присвоить ссылку на другой объект
        // this.ints = new int[2];
        // Но мы можем изменять состояние объекта (массива на 10 ячеек -  private final int capasity = 10;)
        ints[0] = 100;
        ints[0] = 200;
        ints[5] = 300;

    }
    // Использование final в методе
    // Значит, что внутри метода не возможно изменить значение переменной
    public void finalTest(final int x, final int[] array){
        // x = 100;// Переприсвоить значение переменной Х не возможно
        System.out.println(x);

        // Можем менять состояние объекта (индекса массива)
        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        // Но не можем присвоить ссылку на другой объект
        // array = new int[100];

    }
    // Сеттеры для финальных (final) полей не генерируем (сеттеры IDEA не выдает)
    public int getCapasity() {
        return capasity;
    }

    public int[] getInts() {
        return ints;
    }

    public int getNotFinal() {
        return notFinal;
    }

    public void setNotFinal(int notFinal) {
        this.notFinal = notFinal;
    }
}
