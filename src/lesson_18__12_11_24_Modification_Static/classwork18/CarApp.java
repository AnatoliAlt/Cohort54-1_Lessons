package lesson_18__12_11_24_Modification_Static.classwork18;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("Статическое < static > поле до создания объектов: " + Car.totalCars);
        System.out.println();

        Car bmw = new Car("BMW", 200);
        System.out.println("До создания второго авто.");
        System.out.println(bmw.toString());
        System.out.println();

        Car vw = new Car("VW", 300);

        System.out.println("bmw.toString(): " + bmw.toString());
        System.out.println("vw.toString(): " + vw.toString());
        System.out.println();

        vw.setPower(330);// Поменяли POWER с 300 на 330
        System.out.println("vw.toString(): " + vw.toString());

        // К static мы можем обратиться от имени класса
        // Car - это наименование КЛАССА. Олбращение к классу Car.
        System.out.println("Static var:" + Car.totalCars);// Результат: Static var:2
        System.out.println();
        // Я могу обратиться к static, от имени конкретного объекта
        // Но это плохая практика.
        // Нам следует ВСЕГДА обрашаться к static только от имени класса.
        // Например: Car.totalCars);
        System.out.println("static var: " + vw.totalCars);


    }
}
