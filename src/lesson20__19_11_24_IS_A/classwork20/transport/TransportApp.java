package lesson20__19_11_24_IS_A.classwork20.transport;

public class TransportApp {

    public static void main(String[] args) {

        Bus bus = new Bus("Bus-X1", 2020, 10);
        System.out.println(bus.toString());

        bus.start();
        bus.stop();

        System.out.println("bus.getModel(): " + bus.getModel());
        System.out.println("bus.getCapacity(): " + bus.getCapacity());

        System.out.println("----------- Train ------------------------------");

        // Унаследованно от класса - Train
        Train train = new Train("Train-M1", 2024, 4, 15);
        System.out.println("train.toString(): " + train.toString());

        // Уноследованно от класса - Vehicle
        System.out.println(" this.model = \"Default: " + train.getModel());
        System.out.println(" this.year = 2000: " + train.getYear());

        System.out.println("Количество пассажиров-train Capacity: " + train.getCapacity());
        train.setCountWagens(6); // количество вагонов
        System.out.println("train Capacity: " + train.getCapacity());
        train.setCountWagens(1);// количество вагонов
        System.out.println("train Capacity: " + train.getCapacity());

        System.out.println("---------- Bus -----------------------");

        System.out.println(bus.takePassengers());

        Bus bus1 = new Bus("Bus-B2", 2023, 4);
        System.out.println(bus1.takePassengers());
        System.out.println("2. `==========================");
        System.out.println(bus1.takePassengers());
        System.out.println("3. `==========================");
        System.out.println(bus1.takePassengers());
        System.out.println("4. `==========================");
        System.out.println(bus1.takePassengers());

        System.out.println("count: " + bus1.getCountPassengers());
        System.out.println("count (осталось пассажиров): " + bus1.getCountPassengers());


        System.out.println("1. " + bus1.dropPassenger());
        System.out.println("2. " + bus1.dropPassenger());
        System.out.println("3. " + bus1.dropPassenger());
        System.out.println("4. " + bus1.dropPassenger());


        System.out.println("1. " + bus1.droopPassenger());

        //System.out.println("");
        System.out.println("Осталось пассажиров в автобусе: " + bus1.getCountPassengers());

        System.out.println("=============================================\n");

        // UML схемы
        /*
        Unifeid Modeling Language - Единый язые грфическаго моделирования
        Который используется -
         - для визуализации
         - спецификации
         - конструирования
         - документирования документации
         - документирование каких-то програмных решений
         */
        // Диаграмма классов

        // Создаем объект
        InternationalBus internationalBus =
                new InternationalBus("MAN-I1", 2000, 40,
                        new String[]{"Italy", "France", "Spain", "Manaco"});

        System.out.println("Year: " + internationalBus.getYear()); // метод и поле из Vehicle
        System.out.println("take Passengers: " + internationalBus.takePassengers()); // метод из Bus
        System.out.println("toString: " + internationalBus.toString()); // метод из Vehicle
        System.out.println("Capacity: " + internationalBus.getCapacity()); //метод и поле из Bus
        internationalBus.goToRoute(); // метод из InternationalBus

        System.out.println("======== Array =================");

        // Явная инициализация (укороченная) массива
        String[] strings = {"Italy", "France", "Spain", "Manaco"};

        //strings = {"Java", "Python"}; - переприсвоение новой ссылки - так не работает

        // Только используя полную форму инициализации массива ->
        // мы можем переприсвоить значения новой ссылки
        strings = new String[]{"Java", "Python"};

    }
}
