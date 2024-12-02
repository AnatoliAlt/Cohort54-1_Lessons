package lesson15__31_10_24_OOP_Abstraction_Constructor.classwork15;

public class Cat2 {

    // Поля класса - описание (свойства)
    String name;
    String color;
    int age;

    public void sleep() {
        System.out.println("Я сплю!");
    }

    public void run() {
        System.out.println("Я бегу");
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

    //------ 02:00:35 Параметризированый конструктор ---------/

    public Cat2(String catName){
        name = catName;
    }
    public Cat2(){

    }
}
