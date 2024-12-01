package lesson20__19_11_24_IS_A.classwork20.transport;

// Smartphone is-a Vehicle НЕ ВЕРНО. Наследоваться нельзя.
// Проверка - Является ли автобус транспортным средстаом - Bus - Train is-a - Vehicle - УТВЕРЖДЕНИЕ ВЕРНО

public class Bus extends Vehicle {
    /*
    A (Vehicle) EXTENDS (расширяет) B (Bus) -> B наследуется от класса А
    В - является потомоком (ребенком, наследником), А - родитель (родительсктй класс)
     */

    private int capacity; // вместимость
    private int countPassengers; // сколько сейчас пассажиров в автобусе

    public Bus(String model, int year, int capacity) { // конструктор

        // Нужно сначала создать объект родителя
        // SURER - КЛЮЧЕВОЕ СЛОВО - ОБРАЩЕНИЕ К РОДИТЕЛЬСКОМУ КЛАССУ
        super(model, year); // Вызов конструктора родительского класса
        this.capacity = capacity;// capacity - вместимость - то, что пришло в конструкторе
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    // Взять на борт одного пассажира
    public boolean takePassengers() {
        // Проверка. Есть ли свободное место.
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус: " + model);
            //System.out.println("Пассажир зашел в автобус: " +this.getModel());
            return true;
        }
        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажира\n", model,
                countPassengers);
        // this.getModel(), countPassengers);

        return false;
    }

    // Высадка пассажира из автобуса
    public boolean dropPassenger() {
        // Проверяем есть ли в автобусе пассажир
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса." + model);
            return true;
        }
        System.out.printf("Пассажир не вышел из автобуса. Сечас в автобусе %d пассажира\n", countPassengers);
        return false;

    }

    public boolean droopPassenger() {
        // Проверяем есть ли в автобусе пассажир
        if (capacity != countPassengers) {
            countPassengers = countPassengers - countPassengers;
            System.out.printf("Все пассажиры вышли и осталось в автобусе %d пассажиров:\n ", countPassengers);
            return true;
        }
        System.out.println("Пассажиры остались в автобусе.");
        return true;
    }


}
