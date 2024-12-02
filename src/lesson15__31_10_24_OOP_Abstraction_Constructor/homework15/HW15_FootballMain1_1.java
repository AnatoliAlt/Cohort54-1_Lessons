package lesson15__31_10_24_OOP_Abstraction_Constructor.homework15;

public class HW15_FootballMain1_1 {

    public static void main(String[] args) {

        HW15_Football1 football = new HW15_Football1();

        football.coach();
        football.athlete();
        football.fan();





        HW15_Football1 football1 = new HW15_Football1("Mark", 50);
        football1.info1();

        HW15_Football1 football2 = new HW15_Football1("Rit", 25);
        football2.info2();

        HW15_Football1 football3 = new HW15_Football1("Wlad", 28);
        football3.info3();
    }

}
