package lesson36__06_02_25_Comparable_Comparator.homework36;

import java.util.Comparator;

public class SportNameComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        String name1 = s1.getName();
        String name2 = s2.getName();
        return name1.compareTo(name2);
    }
}
