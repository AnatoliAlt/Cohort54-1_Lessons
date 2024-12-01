package lesson21__21_11_24_HAS_A_Association_Aggregation_Composition.classwork21;

public class AutoPark3 {
    public static void main(String[] args) {


        BusDriver2 busDriver = new BusDriver2("John", "LN-45844564");

        Autobus1 bus = new Autobus1(busDriver, 15);
        System.out.println(bus.toString());

        BusDriver2 peter = new BusDriver2("Peter", "LN-12348789");
        bus.setDriver(peter);

        System.out.println(bus.toString());
        System.out.println(busDriver.toString());

        System.out.println("===================================\n");

        BusDriver2 margo = new BusDriver2("Margo", "AE-433453537");
        Autobus1 bus1 = new Autobus1(margo, 24);
        System.out.println(bus1.toString());

        bus1.instalNewAutopilot("AP-gpt6");
        System.out.println(bus1.toString());
        margo.setName("Margo-Susana");// Водитель поменял свое имя
        System.out.println(bus1.toString());

        bus1 = null;// Объект autopilot тоже равен null и пропадет вместе с объектом bus1

        System.out.println(margo.toString());// объект BusDriver2 Мargo октивен

        System.out.println(bus.toString());
        bus.setDriver(margo);// В объект Bus вместо BusDriver Peter мы пересадили объект BusDriver Margo
        System.out.println(bus.toString());

        System.out.println("=========================================\n");

        Passenger5 passenger = new Passenger5("Alex");
        Passenger5 passenger1 = new Passenger5("Max");

        System.out.println(passenger.toString());
        System.out.println(passenger1.toString());

        bus.takePassenger(passenger);
        System.out.println("Количество пассажиров в автобусе: " + bus.getCountPassanger());
        bus.takePassenger(passenger1);
        System.out.println("Количество пассажиров в автобусе: " + bus.getCountPassanger());
        bus.takePassenger(passenger1);
        System.out.println("Количество пассажиров в автобусе: " + bus.getCountPassanger());


    }

}
