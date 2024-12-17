package lesson27__12_12_24.classwork27.enums.days;

public class DaysApp {
    public static void main(String[] args) {

        for (Day day : Day.values()){

            System.out.println("day (toString по умолчанию): " + day);
            System.out.println("day.getRussianName(): " + day.getRussianName());
            System.out.println("day.getDayNumber(): " + day.getDayNumber());
            System.out.println("day.testMethod(): " + day.testMethod());
            System.out.println("=========================\n");
        }
    }
}
