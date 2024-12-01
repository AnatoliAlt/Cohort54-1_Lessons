package lesson20__19_11_24_IS_A.classwork20.transport;

// Проверка - Является ли поезд автобусом - Train is-a - Bus - УТВЕРЖДЕНИЕ НЕ ВЕРНО
// Train is-a Vehicle - Поезд является транспортным средством - можно наследоваться от класса Vehicle.

public class Train extends Vehicle {

    private int capacity;
    private int countPassenger;
    private int countWagens;
    private final int wagonCapacity;

    public Train(String model, int year, int countWagens, int wagonCapacity) {
        // Когда используется механизм наследования - пеоед созданием объекта класса-потомка ->
        // -> мы должны вызвать конструктор родителя.
        // Если нет явного вызова конструктора кодительского класса super();, то автоматически добавляется ->
        // -> вызов конструктора по умолчанию (конструктор без параметров).

        //super();// Пустой конструктор по умолчанию
        //public Vehicle(){
        //   this.model = "Default";
        //   this.year = 2000;
        //}
        super(model, year);// Вызов конструктора должен быть первой строчкой исполняемого кода.
        this.countWagens = countWagens;
        this.wagonCapacity = wagonCapacity;
        this.capacity = countWagens * wagonCapacity;// Расчет на количество пассадочных мест.
        // или еще один метод расчета на количество пассадочных мест.
        calkulateCapacity();// Нажимаем правой кнопкой мыши на Show Context Actions, потом ->
        // -> выбираем Create method calkulateCapacity in Train и создаем метод и переносим
        // в метод код  this.capacity = countWagens * wagonCapacity;

    }

    private void calkulateCapacity() {
        this.capacity = countWagens * wagonCapacity;
    }

    public int getCountWagens() {
        return countWagens;
    }

    public void setCountWagens(int countWagens) {
        this.countWagens = countWagens;
        // Т.к. кол-во вагонов изменилось - изменилось общая вместительность поезда.
        calkulateCapacity();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }
}
