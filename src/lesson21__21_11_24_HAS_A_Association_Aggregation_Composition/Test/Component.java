package lesson21__21_11_24_HAS_A_Association_Aggregation_Composition.Test;
/*
Task 2
Компьютер и компоненты
-- > Создайте базовый класс Component с полями brand (бренд) и model (модель).
Создайте производные классы: Processor, Memory, Storage от класса Component.
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory не могу существовать без компьютера.
 */
public class Component {
    private String brend;
    private String model;

    public Component(String brend, String model) {
        this.brend = brend;
        this.model = model;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
