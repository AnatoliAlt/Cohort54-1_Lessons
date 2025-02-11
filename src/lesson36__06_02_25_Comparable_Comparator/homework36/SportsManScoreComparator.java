package lesson36__06_02_25_Comparable_Comparator.homework36;

import java.util.Comparator;

public class SportsManScoreComparator implements Comparator<Sportsman> {


    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return s1.getScore() - s2.getScore();
    }
}
