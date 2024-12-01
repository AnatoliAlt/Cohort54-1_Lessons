package lesson22__26_11_24_Polymorphism.classwork22.animals;

public class Dog extends Animal { //  Animal - Животное

// Переопределение метода voice от родительского класса Animal

   public void voice() { // voice - голос
       // super - это обращение к объекту родителя
       super.voice();// обращаемся (super.) к методу родительского класса для реализации его метода voice(
   }
}
