package lesson_07__01_10_24_if_Switch_StringEquals.classwork;

public class SwitchExample_6 {
    public static void main(String[] args) {
        /*
        switch - позволяет чравнивоть значение переменной с несколькими значениями

        switch (переменная для сравнения){
        case знечения1:
             // Блок кода 1
        case знечения2:
             // Блок кода 2
        case знечения N:
             // Блок кода N
        default:
             // Блок кода default
         */

        //int x = 35;
        int x = 7;

        if (x == 5) {
            System.out.println("if: x равен 5");
        } else if (x == 7) {
            System.out.println("if: x равен 7");
        } else {
            System.out.println("if: что-то другое");
        }
        // switch

        switch (x) {
            case 5:
                System.out.println("switch: x равен 5");
                break;
            case 7:
                System.out.println("switch: x равен 7");
                break;
            default:
                System.out.println("switch: что-то другое");
        }
        System.out.println("Продолжение программы после switch");

        // Этот вариант кода работает толь с 14 JAVA

    //  Random random = new Random();

    //  int money = 100;
    //  int note = random.nextInt(5) +1;

    //  money = switch(note){
    //      case 5 -> money + 20;
    //      case 4 -> money + 10;
    //      case 3 -> money + -10;
    //      case 2 -> money + -20;
    //      case 1 -> 0;
    //      default -> money;
     //   }
    }
}
