package lesson36__06_02_25_Comparable_Comparator.classwork36;

import org.jetbrains.annotations.NotNull;

public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private int maxSpeed; // Максимальная скорость

    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", year=").append(year);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append('}');
        return sb.toString();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    // Метод, который сравнивает текуший объект Car с другим объектом Car1.
    @Override
    public int compareTo(Car car1) {
        return this.year - car1.getYear(); // Метод для сравнения объектов по году выпуска





        /*
        this - car1 - >

        a vs b - кто больше
        a < b - > возвращает отрицательное значение
        a > b - > возвращает положительное значение
        a == b - > возвращает ноль (0)
         */
    }
}
