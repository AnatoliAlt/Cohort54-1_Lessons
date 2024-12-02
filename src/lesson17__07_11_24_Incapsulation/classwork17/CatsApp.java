package lesson17__07_11_24_Incapsulation.classwork17;

public class CatsApp {
    public static void main(String[] args) {

        Cats cats = new Cats("Catty", 8, 5);

        System.out.println(cats.toString());
        // cats.test(); - private метод я не могу вызвать вне кода класса

        //System.out.println(cats.name);// name - не доступно, так как помечена модификатором private
        //System.out.println(cats.age);

        // cats.age = -1000;
        // cats.weight = 1500;
        // cats.age = 100;// Доступен, т.к. age имеет модификатор доступа по умолчанию (package-default)
       // cats.name = null;

        // System.out.println(cats.age);

        System.out.println(cats.toString());

        cats.seyMeow();

        System.out.println("========= get ===================");
        // Возвращаем и распечатываем - get
        String catName = cats.getName();
        System.out.println("cat.getName: " + catName);
        int catAge = cats.getAge();
        System.out.println("cat.getAge: " + catAge);
        System.out.println();
        System.out.println("=========== set ===============");
        cats.setName(null);
        System.out.println("-----------------------");
        cats.setName("Max");
        System.out.println(cats.toString());
        System.out.println("--------------------");
        cats.setAge(-1000);// Метод проигнорировал -1000 согласно if (age >= 0 && age < 20){
        cats.setAge(15);
        System.out.println(cats.toString());
        System.out.println();
        cats.eat();// Метод - котик поел
        System.out.println(cats.toString());




    }



}
