package lesson18__12_11_24_Modification_Static_Infiniti.classwork18.staticBlock;

public class Car {
    public static  int totalCars;// Используем для подсчета количества объектов
    private String model;
    private int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;

        // Увеличиваем общее количество автомобилей при создании нового объекта.
        totalCars++;
    }
    public String toString(){
        return String.format("Auto - model: %s, power: %d. " +
                "Всего создано автомобилей: %d", model, power, totalCars);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    // Статическая переменная может быть создана толька как поле класса
    public void test(){
        int x = 10;
       // static int y = 20;// IDEA - выдает ошибку
    }
}
