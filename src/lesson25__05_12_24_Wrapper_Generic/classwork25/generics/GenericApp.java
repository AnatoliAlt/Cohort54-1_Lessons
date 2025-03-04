package lesson25__05_12_24_Wrapper_Generic.classwork25.generics;

public class GenericApp {
    public static void main(String[] args) {
        // GenericBox <Car> boxCar = new GenericBox<>();
        // При создантии класса типа <T>, то при создании объекта public class GenericBox <T> {
        // мы указываем какого типа будет наш объект <String>
        //
        GenericBox<String> box = new GenericBox<>("Hello");
        String strValue = box.getValue();

        System.out.println("Длина слова HELLO: " + strValue.length() + " значений.");
        System.out.println(box.getValue().toUpperCase());

        box.setValue("Test");
        System.out.println(box);

        System.out.println("===============================");

        // Generics - работают ТОЛЬКО со ссылочными типами данных.
        // Т.е. НЕ работают с примитивными типами данных.
        // GenericBox<int> boxInt = new GenericBox<>(); Не будет работать

    }
}
