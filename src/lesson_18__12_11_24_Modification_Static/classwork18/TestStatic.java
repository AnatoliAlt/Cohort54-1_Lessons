package lesson_18__12_11_24_Modification_Static.classwork18;

public class TestStatic {
    // non-static поле класса

    int x;

    // static - поле класса
    static int staticY;

    // Статический метод
    public static void staticMethod() {

        // Статические методы видят ТОЛЬКО статические члены (поля и методы) класса
        // x++; IDEA выдаст ошибку. Нет доступа к не-статическоту полю.
        staticY++;// Есть доступ к статическому полю.
        // Мы можем вызвать только статические методы.
        //nonStaticMethod();// Не статический метод не мену вызвать. IDEA даст ошибку.

        // Ключевае слово this не доступно в статических методах
        // this.x

    }

    // Не-статический метод
    public void nonStaticMethod() {
        // У нестатических методов есть доступ КО ВСЕМ членам класса
        x++;// Не статика доступна
        staticY++; // Статика тоже доступна
        // Так-же мы можем вызывать и НЕ-статические и статические методы класса
        staticMethod();// Static метод
    }

    // Метод main статический. И имеет доступ только к статическому контенту.
    public static void main(String[] args) {
        // Ошибка компиляции. У статик метода нет доступа к НЕ-статик переменной.
        // x = 10; // Доступа нет. Эта переменная в этом методе не видна.
        staticMethod();// Можем вызвать статические методы
        // или
        TestStatic.staticMethod();// Можем вызвать статик метод.
        // nonStaticMethod();// Не возможно вызвать не статический метод без создания объекта

        // Мы можем вызвать не-статик метод, используя ссылку на объект.
        TestStatic testStatic = new TestStatic();
        testStatic.nonStaticMethod();// Теперь все работает

        System.out.println("========== class MathUtil ==============");
        int sum = MathUtil.sumOfIntegers(1, 2, 3, 4, 7, 8);
        System.out.println("sum: " + sum);
        System.out.println();

        MathUtil.setCounter(10);
        System.out.println("MathUtil.getCounter(): " + MathUtil.getCounter());


    }
}
