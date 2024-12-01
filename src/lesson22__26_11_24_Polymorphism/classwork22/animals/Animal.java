package lesson22__26_11_24_Polymorphism.classwork22.animals;

public class Animal { //  Animal - Животное

    public void voice(){ // voice - голос
        System.out.println("Animal say something (скажи что-нибудь)"); // say . сказать, something - что-нибудь

    }
    // Полиморфизм - переопределение метода родительского класса - Object.
   @Override
   public String toString(){
       return "Animal to String ";
   }
}
