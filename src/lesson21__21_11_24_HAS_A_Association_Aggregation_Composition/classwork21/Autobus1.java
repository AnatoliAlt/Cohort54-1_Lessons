package lesson21__21_11_24_HAS_A_Association_Aggregation_Composition.classwork21;
/*
- Ассоциация - это связь, при которой один объект связан с другим объектом.
Это наиболее общая форма связи.

- Агрегация - это более специфическая форма ассоциайии, предчтавляющая собой отношение "часть-целое"
Где часть может существовать независимо от целого.

- Композиция - это более жесткая форма агрегации, где часть не может существовать без целого.
Если целое уничтожается, то часть тоже уничтожается.

- Для создания связи типа HAS-A мы определяем поле класса,
которое будет хранить ссылку на объект другого класса.

- Ассоциация (в том числе Агренация и Комразиция) реализуется через создание ссылок на другие объекты в
нутри класса.
Отношение, где один класс использцет другой класс в качестве одного из своих полей.
Класс содержит поле, которое ссылается на объекты другого класса.

- ВАЖНЫЕ аспекты ассоциации
Направленность связи: Однонаправденная и двунаправленная.

Однонаправленная связь - это когда один объект знает о другом объекте, а другой объект ничего не знает о первом объекте.

Двунаправленная связь - это когда оба объекта знают друг о друге.

Кардинальность связи - определяет, сколько объектов одного класса может быть ассоциировано
с объектом другого класса.
Кардинальность может быть - One-to-One (один к одному), One-to-Many (один ко многим), Many-to-Many (многие ко многим)

Например:

One-to-One (один к одному)
1 : 1 -  Автобус и двигатель.
Кждый автобус будет иметь ровно один двигатель и на каждый двигатель приходится ровно один автобус.

One-to-Many (один ко многим)
1 : Many - Автобус и список пассажнров.
Один автобус может перевозить множество пассажировю
Каждый пассажир находится в одном автобусе.

Many-to-Many (многие ко многим)
Many : Many
Список автобусов и список автобусных остановок.
Каждый автобус останавливается на множестве остановок.
И каждая астановка может обслужить сножество автобусов.

 */

public class Autobus1 {

    private static int counter;// счетчик - статическая переменная, видимая для всех объектов
    private final int id; // Индивидуальный индификационный номер автобуса

    // Наследованное поле от класса BusDriver и AutoPilot4_Composition
    // Агрегация(мягкая связь)
    private BusDriver2 driver; // Поле, хранящее ссылку на объект BusDriver.

    // Композиция, жесткая / неразрывная связь
    private AutoPilot4_Composition autoPilot; // Поле, хранящее ссылку на объект AutoPilot4_Composition.

    private final int capacity; // Вместимость
    private int countPassanger; // Количество пассажиров

    // Список пассажиров. Агрегация. Однонаправленная. 1 = Many.
    // в одном автобусе множество пассажиров
    private final Passenger5[] passengers; // Список пассажиров

    public Autobus1(BusDriver2 busDriver, int capacity) {
        this.id = counter++; // Написал вручную. Автоматически констуктором не создается
        this.driver = busDriver; // Наследованное поле от класса BusDriver и помещенная в поле private BusDriver driver;
        this.capacity = capacity;
        // Часть (объект автопилота) создается при создании целого (объект автобуса)
        this.autoPilot = new AutoPilot4_Composition("AP-v001");// Наследованное поле от класс AutoPilot4_Composition

        // Реализуем двунаправленную связь
        //this.autoPilot.setAutobus1(this);// Передаю ссылку на этот автобус (this)

        this.passengers = new Passenger5[capacity];
    }


    public boolean takePassenger(Passenger5 passenger5) {
        /*
        Надо проверить:
        1. Есть ли свободное место.
        2. Находится ли пассажир уже в автобусе (в списках пассажиров автобуса).
        3. Если проврки пройдены - садим на борт.
           3.1 Если пассажира неи в списках, то добавляем его в списки пассажиров.
           3.2 Увеличиваем кал-во пассажиров в автобусе.
           3.3 Возвращаем trrue
        4. Если что-то пошло не так - выдаем сообщение об ошибке и возвращаем false.
         */

        if (countPassanger < capacity) {
            // Место есть
            // Нодо проверить, есть ли такой пассажир в автобусе
            // Декомпозиция
            if (isPassengerInBus(passenger5)) {
                // Такой пассажир есть в списке
                System.out.printf("Пассажир id: %d уже в автобусе с id %d\n", passenger5.getId(), this.id); // this.id - id автобуса
                return false;
            }

            // Садим на борт
            passengers[countPassanger] = passenger5;
            countPassanger++;
            System.out.printf("Пассажир id: %d завершил посадку в автобус с id %d\n", passenger5.getId(), this.id); // this.id - id автобуса
            return true;
        }
        // Свободного места нет
        System.out.printf("В автобусе id: %d свободных мест нет!\n", this.id);
        return false;
    }
    // TODO написать метод высадки пассажиро из автобуса
    /*
    Сначала проверить есть ли пассажир в автобусе.
    Убрать из списка пассажиров.
    [1, 2, 6, 78, 99] -> убрать с id 6 [1, 2, 78, 99]
    Уменьшить кол-во пассажиров.
     */

    private boolean isPassengerInBus(Passenger5 passenger5) {
        for (int i = 0; i < countPassanger; i++) {
            if (passengers[i].getId() == passenger5.getId()) {
                return true;
            }
        }
        // Пассажира с таким id нет в нашем массиве пассажиров
        return false;

    }

    // Объект автобуса будет управлять автопилотом.
    // setter и getter не выдаются на этот метод
    public void updateAutopilotVersion(String softwareVersion) {
        this.autoPilot.setSoftwareVersion(softwareVersion);
    }

    // Метод для обнавления новой версии автопилота
    public void instalNewAutopilot(String softwareVersion) {
        this.autoPilot.setAutobus1(null);// Объект autoPilot не ссылается больше на объект setAutobus1(null) из-за ссылки (null)

        // Нудно следить за правильностью ссылки с обеих сторон двунаправленной связи
        this.autoPilot = new AutoPilot4_Composition(softwareVersion);

        // Создаем новый объект autoPilot и передаем туда ссылку автобуса (this)
        this.autoPilot.setAutobus1(this);// (this) -> Так как мы находимся внутри класса Autobus1 ->
        //-> мы можем с помощью (this) передать объект автобуса.
        // (this) - Это ссылка на текущий объект.
    }


    @Override
    public String toString() {// Вызываем метод public String toString(){ у класса BusDriver2
        final StringBuilder sb = new StringBuilder("Autobus: {");
        sb.append("id: ").append(id);
        sb.append(", capacity: ").append(capacity);
        sb.append(", driver:  ").append(driver);
        sb.append(", autopilot:  ").append(autoPilot);
        sb.append('}');
        return sb.toString();
    }


    public BusDriver2 getDriver() {
        return driver;
    }

    public void setDriver(BusDriver2 driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassanger() {
        return countPassanger;
    }


}

