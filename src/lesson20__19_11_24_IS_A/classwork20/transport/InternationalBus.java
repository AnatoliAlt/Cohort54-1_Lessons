package lesson20__19_11_24_IS_A.classwork20.transport;

public class InternationalBus extends Bus {

    private String[] countries;// Массив стран

    public InternationalBus(String model, int year, int capacity, String[] countries) {
        super(model, year, capacity);
        this.countries = countries;
    }

    public void goToRoute() {
        for (int i = 0; i < countries.length; i++) {
            System.out.println("Посещаю страну: " + countries[i]);

        }
    }
}
