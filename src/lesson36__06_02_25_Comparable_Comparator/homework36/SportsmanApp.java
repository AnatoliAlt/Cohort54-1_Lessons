package lesson36__06_02_25_Comparable_Comparator.homework36;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {

        Sportsman[] sportsmen = new Sportsman[5];

        sportsmen[0] = new Sportsman("Ivan", 30, 100);
        sportsmen[1] = new Sportsman("Alexander", 20, 50);
        sportsmen[2] = new Sportsman("Vasiliy", 40, 150);
        sportsmen[3] = new Sportsman("Petr", 35, 130);
        sportsmen[4] = new Sportsman("Petr", 30, 150);


        System.out.println("=========== Age - Интерфейс Comparable =======");
        // Интерфейс Comparable
        Arrays.sort(sportsmen);
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("=========== Name - Интерфейс Comparator =========");

        Arrays.sort(sportsmen, new SportNameComparator());
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("=========== Score - Интерфейс Comparator =======");

        //  Arrays.sort(sportsmen, new SportsManScoreComparator());
        // System.out.println(Arrays.toString(sportsmen));
        SportsManScoreComparator sportsManScoreComparator = new SportsManScoreComparator();
        Arrays.sort(sportsmen, sportsManScoreComparator);
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("======== Anonymous ====================");
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman sportsman1, Sportsman sportsman2) {
                return sportsman1.getName().compareTo(sportsman2.getName());
            }
        });
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {

            @Override
            public int compare(Sportsman s1, Sportsman s2) {
             //   return s1.getScore() - s2.getScore();
                return s2.getScore() - s1.getScore();
            }
        });
        System.out.println(Arrays.toString(sportsmen));


    }


}
