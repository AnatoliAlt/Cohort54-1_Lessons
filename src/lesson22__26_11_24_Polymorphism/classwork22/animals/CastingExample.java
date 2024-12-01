package lesson22__26_11_24_Polymorphism.classwork22.animals;

public class CastingExample {
    public static void main(String[] args) {

        // Восходящее и нисходящее преоброзование.

        // Восходящее преоброзование - это возможность присвоить переменной типа предка
        // ссылку на объект потомка.
        Cat cat2 = new Cat();
        Animal animal1 = cat2; // Восходяшее преобразование.
        // или, другая возможность
        Animal animal11 = new Cat(); // Тип объекта Cat автоматически преобразуется к типу Animal.

        // Восходяшее преоброзование является безопасным, т.к. у родительского класса ГАРАНТИРОВАННО
        // есть все методы родительского класса.
        /*
        Тип (Animal1) ссылочной переменной (animal11)
        1. Ссылки на объекты каких типов здесь могут храниться (быть присвоены)
        2. Какие методы мне доступны для вызова с этой переменной.
         */

        animal11.voice();// animal11. - это ссылка и после точки  вызываем все доступные методы
        // из класса Cat, а так-же класса Animal (и супер класса Object) и используем нужный нам метод.

        System.out.println("============ Неявное преоброзование ========================");

        Animal animal12 = new Dog(); // Неявное автоматическое преоброзование.
        Animal animal13 = new Hamster();

        Animal[] animal1s = new Animal[3];// В массиве 3 животных
        animal1s[0] = animal11;
        animal1s[1] = animal12;
        animal1s[2] = animal13;

        for (int i = 0; i < animal1s.length; i++) {
            animal1s[i].voice();// реализация метода voice во всех 3 классах -  Cat2,  Dog3, Hamster4.

            System.out.println("========== Восходящее неявное преоброзование =========");

            Cat catLink;

            Animal animal1Link = new Cat();
            // animal1Link.eat(); // На ссылке типа Animal1 метод eat() из класса Cat2 не доступен к вызову.
            // То-есть, мы можем вызвать по ссылке animal1 методы только класса Animal1, а методы класса Cat2
            // мы вызвать не можем.

            System.out.println("==== Нисходящее явное преоброзование ================");
            System.out.println("====== DownCasting ===============");

            // catLink = animal1Link;// Нисходящее преоброзование. И оно не является безопасным.
            catLink = (Cat) animal1Link; // Нисходящее ЯВНОЕ преоброзование типа ссылки. Не является безопасным.
            catLink.eat();

            for (int j = 0; j < animal1s.length; j++) {
                Animal current = animal1s[i];
                System.out.println("sout: " +current);

                // getClass - получить тип объекта
                System.out.println("getClass: " + current.getClass().getSimpleName());

                // оператор - instanceof - возвращает boolean значение - может проверить, является ли объект экземпляром
                // нужного подкласса.
                // Можно ли преоброзовать объект к типу ссылки.

                // Проверяем, можно ли присвоить ссылку на объект в переменную типа Cat.
                if (animal1s[i] instanceof Cat){
                    System.out.println(i + "-й индекс можно безопасно привести к Cat");
                    Cat tempCat = (Cat) animal1s[i]; // Не безопасное преоброзование
                    tempCat.eat();
                }



                System.out.println("=============================================");

            }

        }

    }
}
