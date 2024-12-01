package lesson22__26_11_24_Polymorphism.classwork22.animals;

public class Hamster extends Animal { //  Animal - Животное


    @Override
    public void voice() {
       // super.voice();
        System.out.println("Hamster voice hrum-hrum");
    }

    @Override
    public String toString() {
        return super.toString() + " | Hamster. Дополнение реализации родительского метода." ;
    }
}
