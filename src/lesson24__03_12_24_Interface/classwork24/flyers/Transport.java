package lesson24__03_12_24_Interface.classwork24.flyers;

public abstract class Transport {

   protected int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }
    abstract void takePassenger(); // Абстрактный метод takePassenger
    public int countPassenger(){ // Метод с реализацией и возвращающий  return capacity;
        return capacity;


    }
}
