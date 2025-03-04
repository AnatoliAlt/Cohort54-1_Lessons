package lesson24__03_12_24_Interface.classwork24.flyers;

public class FlyersApp {
    public static void main(String[] args) {

        Airplane aiplane = new Airplane(15);
        Flyable duck = new Duck();
        Swimmable boat = new Boat(50);



        Flyable[] flyables = new Flyable[2];
        flyables[0] = aiplane;
        flyables[1] = duck;

        for (int i = 0; i < flyables.length; i++) {
            Flyable flyable = flyables[i];
            flyable.fly();
            if (flyable instanceof Airplane){
                // Casting
                Airplane airplane1 = (Airplane) flyable;
                airplane1.takePassenger();
                System.out.println("Количество пассажиров на борту: " + airplane1.countPassenger());
            }

        }
        System.out.println("===========================================");

        Transport[] transports = {aiplane, (Transport) boat};
        for (int i = 0; i < transports.length; i++) {
            Transport transport = transports[i];
            transport.takePassenger();
            if (transport instanceof Flyable){
                Flyable flyable = (Flyable) transport;
                flyable.fly();
            }
            if (transport instanceof Swimmable){
                Swimmable swimmable = (Swimmable) transport;
                swimmable.swim();
            }

        }
    }
}
