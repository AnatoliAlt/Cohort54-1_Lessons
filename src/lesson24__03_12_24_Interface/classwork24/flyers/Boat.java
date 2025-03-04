package lesson24__03_12_24_Interface.classwork24.flyers;

public class Boat extends Transport implements Swimmable{
    public Boat(int capacity) {
        super(capacity);
    }

    @Override
    void takePassenger() {
        System.out.println("Boat take Passenger");
        capacity++;
    }

    @Override
    public void swim() {
        System.out.println("Boat swimming");
    }
}
