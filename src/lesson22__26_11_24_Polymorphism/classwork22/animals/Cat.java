package lesson22__26_11_24_Polymorphism.classwork22.animals;

public class Cat extends Animal { //  Animal - Животное

    // Мы можем переопределить родительский метод voice (изменить реализацию родительского метода).
    // Пишем повторно родительский метод с его реализацией
    @Override // Анатация @Override - указывает, что я переопределяю родительский метод.
    public void voice(){
        System.out.println("Cat say MEOW!!!");
    }

    // Уникальный функционал кота
    // Метод кушать
    public void eat(){ // eat - кушать
        System.out.println("Cat is eating");// Cat is eating - кот кушает
    }
    // Перегрузка метода - статический полиморфизм
    // Метод принимает на вход (String food)
    public void eat(String food){
        System.out.println("Cat is eating " + food);
    }

}
