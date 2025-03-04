package lesson25__05_12_24_Wrapper_Generic.classwork25.generics;

public class Wrappers { // Wrappers - Класс обертка
    public static <Interger> void main(String[] args) {

        // Обертка - это КЛАСС, сылочный тип данных.

        // Классы-Обертки используются в JAVA для представления примитивных типов данных как объектов (ссылочных типов данных)
        /*
        Byte    - обертка для byte
        Short   - обертка для short
        Interger - обертка для int
        Long    - обертка для long
        Double  - обертка для double
        Float   - обертка для float
        Character - обертка для char
        Boolean - обертка для boolean
         */
        // Автоматическае приведение типов позволяет нам автоматически конвертировать приметивы в их обертки и на оборот.
        // Автоупаковка
        // Автораспаковка

        Integer wrapperInt = 5; // Автоупаковка примитива в ссылочный Interger.
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Автораспоковка - из типа Interger автоматически преоброзовало значение в примитив int.
        System.out.println(primitiveInt);

        System.out.println("========= CONSTANTA = MAX_VALUE = MIN_VALUE ==========");

        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue: " + maxValue); // Результат - maxValue: 2147483647
        System.out.println("minValue: " + Integer.MIN_VALUE); // Результат - minValue: -2147483648

        System.out.println("== Особенности сравнения классов - ОБЕРТКИ - ==== ");

        Integer a = 127;
        Integer b = 127;
        System.out.println("127 = 127: " + (a == b)); // Результат - true
        // Для гарантированного правильного сравнения оберточных типов нужно использовать equals()
        System.out.println(127 + ".equals( " + 127 + "): " + a.equals(b)); // Результат - true

        Integer c = 128;
        Integer d = 128;
        System.out.println("128 == 128: " + (c == d)); // Результат - false
        // Для гарантированного правильного сравнения оберточных типов нужно использовать equals()
        System.out.println(128 + ".equals( " + 128 + "): " + a.equals(b)); // Результат - true

        Integer c1 = -128;
        Integer d1 = -128;
        System.out.println("-128 == -128: " + (c1 == d1)); // Результат - true

        String str1 = "Hello"; // Результат - true
        String str2 = "Hello";
        // String str2 = "Hello"; // Второй раз строку "Hello" JAVA не создаст, так как такая строка уже скществует
        // String str2 = new String("Hello"); // Нужна создать новый объект
        System.out.println("str1 == str2: " + (str1 == str2));

        System.out.println("== Кешированиие объектов ==");

        // Все числа в диапазоне (например): byte от -128 до 127 используется кеширование объектов

        // Для гарантированного правильного сравнения оберточных типов нужно использовать equals()
        Integer c3 = 128;
        Integer d3 = 128;
        System.out.println("128 == 128: " + (c3 == d3)); // Результат - false
        // Для гарантированного правильного сравнения оберточных типов нужно использовать equals()
        System.out.println(128 + ".equals( " + 128 + "): " + a.equals(b)); // Результат - true

        System.out.println("== Методы которыми обладают классы обертки ==");

        // Общие или схожие методы, которыми обладают классы обертки
        // 1. Метод - valueOf() - Упаковка. Преобразует строку или примитив в соответствующий объект класса обертки
        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("e == f: " + (e == f)); // Результат: e == f: true

        Double dbl = Double.valueOf("154.5");
        System.out.println("dbl + 1: " + (dbl + 1)); // Результат: dbl + 1: 155.5

        // 2. parseXXX() - преобразует строку в соответствующий примитив
        int intParse = Integer.parseInt("456") + 100;
        System.out.println("intParse: " + intParse);
        double d2 = Double.parseDouble("344.56");  // Результат: intParse: 556
        System.out.println("d2 + 200: " + d2 + 200);  // Результат: d2 + 200: 344.56200

       //  System.out.println(Integer.parseInt("Rrr"));// Если не получится извлечь значение - будет выброшено исключение (ошибка)
       //  System.out.println(Integer.valueOf("Rrr"));// Если не получится извлечь значение - будет выброшено исключение (ошибка)

        // 3. toStrung() - возврашает строковое преодставление значения
        String strNumber = dbl.toString();
        // Происходит конкатенация строк, а не операция сложения
        System.out.println("strNumber (dbl.toString(154.5)) + 10: " + strNumber + 10); // Результат: strNumber (dbl.toString(154.5)) + 10: 154.510

        // 4. equals - Сравнивает два объекта по значению.

        // 5. xxxValue() Распаковка. Возвращет значение объекта как примитивный тип.
        Double dbl2 = Double.valueOf(125.67); // Явная / принудительная упаковка
        double dPrimitive = dbl2.doubleValue(); // Явная / принудительная распаковка

        System.out.println("=== Все числовые обертки наследуются от абстрактного класса Number ===");
        // Byte, Short, Integer, Long, Double, Float

        /*
        Используя любую обертку примитивных типов мы можем вызвать любой метод - например
        Short. .......
        byteValue
        shortValue
        intValue
        longValue
        floadValue
        doubleValue
         */
        Integer integer = 31844;
        System.out.println("Integer integer = 31844 = " + integer.doubleValue());  // Результат: 31844.0 - Тип double

        short sh = integer.shortValue();
        System.out.println(sh); // Результат: 31844

        // Пример 1
        double sum = add(1455343, 344.67);
        System.out.println(sum); // Результат:   return d1 + d2; - 1455687.67

        // Пример 2
        int sum1 = add1(1455343, 344.67);
        System.out.println(sum1);  // Результат:   return d1 + d2; - 1455687

        Integer a1 =Integer.MAX_VALUE;
        System.out.println(Integer.MAX_VALUE);// Результат: 2147483647
        a1 += 100;
        System.out.println(a1); // Результат: -2147483549. Переполнение типа (диапазона) int

        // Переполнение диапазоно в ОБЕРТКАХ так-же как в примитиве.
        Integer a2 = Integer.MAX_VALUE;
        Integer b2 = 1000;
        a2 += b2;
        System.out.println(a2);  // Результат: -2147483549. Переполнение типа (диапазона) int




    }
    // Пример 1
    public static double add(Number number1, Number number2){
        double d1 = number1.doubleValue();
        double d2 = number2.doubleValue();
        return d1 + d2; // Результат:   return d1 + d2; - 1455687.67
    }
    // Пример 1
    public static int add1(Number number1, Number number2){
        int d1 = number1.intValue();
        int d2 = number2.intValue();
        return d1 + d2;  // Результат:   return d1 + d2; - 1455687
    }
}
