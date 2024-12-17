package lesson27__12_12_24.homework27.task1_Enum;

public class SeasonApp {

    public static void main(String[] args) {

        for (Season season : Season.values()){
            System.out.println("Season: " + season + " (" + season.getRussianName() + ")");
            //System.out.println(season.getRussianName());
            System.out.println("Average temperature: " + season.getAverageTemperature() + ("°C"));
            System.out.println("--------------------------------------------------\n");
        }

    }
}
