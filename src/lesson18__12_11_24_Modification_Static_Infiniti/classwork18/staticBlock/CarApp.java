package lesson18__12_11_24_Modification_Static_Infiniti.classwork18.staticBlock;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("Статическое < static > поле до создания объектов: " + TestTest.Car.totalCars);
        System.out.println();

        TestTest.Car bmw = new TestTest.Car("BMW", 200);
        System.out.println("До создания второго авто.");
        System.out.println(bmw.toString());
        System.out.println();

        TestTest.Car vw = new TestTest.Car("VW", 300);

        System.out.println("bmw.toString(): " + bmw.toString());
        System.out.println("vw.toString(): " + vw.toString());
        System.out.println();

        vw.setPower(330);// Поменяли POWER с 300 на 330
        System.out.println("vw.toString(): " + vw.toString());

        // К static мы можем обратиться от имени класса
        // Car - это наименование КЛАССА. Олбращение к классу Car.
        System.out.println("Static var:" + TestTest.Car.totalCars);// Результат: Static var:2
        System.out.println();
        // Я могу обратиться к static, от имени конкретного объекта
        // Но это плохая практика.
        // Нам следует ВСЕГДА обрашаться к static только от имени класса.
        // Например: Car.totalCars);
        System.out.println("static var: " + vw.totalCars);


    }

    public static class MathUtil {

        public  static  int counter = 0;// Создаем поле объекта
        public static int sumOfIntegers(int x, int... ints) {
            int sum = x;
            for (int i = 0; i < ints.length; i++) {
                sum += ints[i];
            }
            return sum;
        }

        public static int getCounter() {
            return counter;
        }

        public static void setCounter(int counter) {
            MathUtil.counter = counter;
        }
    }
}
