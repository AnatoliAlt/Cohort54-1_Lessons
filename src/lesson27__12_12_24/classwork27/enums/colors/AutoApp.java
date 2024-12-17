package lesson27__12_12_24.classwork27.enums.colors;

import java.util.Locale;

public class AutoApp {
    public static void main(String[] args) {
        Color red = Color.RED;

        Auto auto = new Auto("Model", Color.BLUE);
        System.out.println(auto);

        auto.setColor(red);
        System.out.println(auto);
        System.out.println("======= Массив значений ==================");

        // Метод который возвращает массив значений

        Color[] colors = Color.values();
        for (Color currentColor : colors) {
            System.out.println(currentColor);

            System.out.println("== Возвращает enum по строковому имени ==");

            // .valueOf - Принимает на вход строку

            Color color1 = Color.valueOf("RED");
            System.out.println("color1: " + color1);

            System.out.println("== Получить имя константы (строку)");

            String name = Color.GREEN.name();
            System.out.println("name: " + name + "!");
            System.out.println("name: " + name.toLowerCase(Locale.ROOT) + "!");

            System.out.println("== Получить порядковый номер константы (начиная с 0)");

            int ordinal = Color.BLUE.ordinal();
            System.out.println("ordinal: " + ordinal);

            System.out.println("============= SWITCH ====================");

            switch (auto.getColor()) {
                case RED:
                    System.out.println("Цвет машины красный");
                    break;
                case BLUE:
                    System.out.println("Цвет машины синий");
                    break;
                case GREEN:
                    System.out.println("Цвет машины зеленый");
                    break;
                default:
                    System.out.println("Какой-то другой цвет");


            }
            System.out.println("================ Сравнение равенством (==) ===========================");

            // Enum безопасно сравнивать на равенство оператором ==
            auto.setColor(Color.BLUE);
            if (auto.getColor() == Color.BLUE) {
                System.out.println("Цвет машины синий");
            } else {
                System.out.println("Цвет машины не синий");
            }

        }
    }
}
