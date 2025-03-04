package lesson25__05_12_24_Wrapper_Generic.classwork25.generics;

public class SimpleApp {
    public static void main(String[] args) {
        SimpleBox box = new SimpleBox(10);
        System.out.println(box);

        SimpleBox box1 = new SimpleBox(20);
        System.out.println(box1);

        // int sum = box.getValue() + box1.getValue(); -> Проводим кастинг

        int sum = (int) box.getValue() + (int) box1.getValue(); // -> Проводим кастинг
        System.out.println("sum: " + sum);

        SimpleBox[] boxes = new SimpleBox[3];
        boxes[0] = box;
        boxes[1] = box1;
        //boxes[2] = new SimpleBox(30);// Число
        boxes[2] = new SimpleBox("30"); // Строка

        int sum1 = 0;
        for (int i = 0; i < boxes.length; i++) {
            // Вызовет .ClassCastException: при попытке - boxes[2] = new SimpleBox("30"); - привести (cacting) к int
            // ("30") - это строка, а не число
            // sum1 = sum1 + (int) boxes[i].getValue();

        }
        System.out.println("sum1: " + sum1);

    }
}
