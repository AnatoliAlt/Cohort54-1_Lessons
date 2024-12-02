package lesson21__21_11_24_HAS_A_Association_Aggregation_Composition.Test;
/*
Task 2
Компьютер и компоненты
1. Создайте базовый класс Component с полями brand (бренд) и model (модель).
2. Создайте производные классы: Processor, Memory (память), Storage (накопитель) от класса Component.
3. -- > Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
3. -- > Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory не могу существовать без компьютера.
Композиция - это, часть не может существовать без целого. Часть создается вместе с целым.
 */
public class Computer {

    private Processor processor; // Жесткая связь - компазиция
    private Memory memory; // - ПАМЯТЬ - Жесткая связь - компазиция
    private Storage storage; // - НАКОПИТЕЛЬ - Мягкая связь - агрегация

    public Computer(Storage storage, String procsBrand, String procesModel) {
        this.storage = storage;
        this.processor = new Processor(procsBrand, procesModel);
        this.storage = new Storage("IBM", "DDR-777");

    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
