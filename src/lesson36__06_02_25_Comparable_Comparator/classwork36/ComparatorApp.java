package lesson36__06_02_25_Comparable_Comparator.classwork36;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        int[] ints = new int[]{9, 5, 1, 5, 2, 0, 15, 10};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];

        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2024, 300);
        cars[5] = new Car("Ferrari", 2021, 250);


        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        // Специальный инструмент для сравнения объектов - interface Comparable (в переводе - "сравнимый объект" доступное к сравнению)

        /*
         Интерфейс Comporator <T> -> Типезированный инструмент для сравнения объектов

        int compare(T o1, T o2);
         */

        System.out.println("=============== Camporator ==============");

        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        Arrays.sort(cars, carSpeedComparator);
        System.out.println(Arrays.toString(cars));

        // String и Integer уже имют встроенную логику сравнения, т. е. они
        // реализуют интерфейс Comparable
        System.out.println("============= Model String ================");
        Arrays.sort(cars, new CarSpeedComparator());
        System.out.println(Arrays.toString(cars));

        System.out.println("== Анонимные классы ===============");

        //    Анонимный класс - это класс, для создания объекта на лету - без явного объявления нового классаю
        // Используется когда необходим одноразовый объект.

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });
        // Сравнение машин по году выпуска в порядке возрастания,
        // если год совподает -сравнить машины по модели в порядке убывания.

        Arrays.sort(cars, new Comparator<Car>() {

            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();
                if (yearCompare != 0) {
                    return yearCompare;
                } else {
                    // Обратный порядок сортировки
                    return c2.getModel().compareTo(c1.getModel());
                }

            }
        });
        System.out.println(Arrays.toString(cars));

        // Отсортировать машины по модели в обратном порядке;
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c2.getYear() - c1.getYear();
                // Или
                //  return c1.getYear() - c2.getYear() * -1;
            }
        });
        System.out.println(Arrays.toString(cars));
    }
}
