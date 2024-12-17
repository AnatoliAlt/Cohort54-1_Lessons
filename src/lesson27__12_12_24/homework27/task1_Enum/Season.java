package lesson27__12_12_24.homework27.task1_Enum;
/*                          Home Work 27
                              Task 1
Реализуйте Enum для определения четырех времен года с методами, возвращающими
среднюю температуру для каждого времени года.
 */

import javax.swing.*;

public enum Season {

    WINTER("Зима", 3),
    SPRING("Весна", 18),
    SUMMER("Лето", 25),
    JUNE("Июнь", 20),
    AUTUMN("Осень", 17);


    private String russianName;
    private int averageTemperature;


    Season(String russianName, int averageTemperature) {
        this.russianName = russianName;
        this.averageTemperature = averageTemperature;
    }

    public String getRussianName() {
        return russianName;
    }

    public void setRussianName(String russianName) {
        this.russianName = russianName;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
}
