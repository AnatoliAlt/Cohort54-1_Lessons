package lesson_16__05_11_24_MagicArray_OOP_Constructor.classwork16;

public class DogApp {
    public static void main(String[] args) {

        Dog dog = new Dog("Bim", 5);
        dog.info();

        dog.run();
        dog.run();
        dog.run();
        dog.run();

        dog.info();
    }
}