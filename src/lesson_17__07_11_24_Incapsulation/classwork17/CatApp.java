package lesson_17__07_11_24_Incapsulation.classwork17;

public class CatApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Catty", 8, 5);

        System.out.println(cat.toString());

        //System.out.println(cat.name);

        //cat.age = -1000;

        cat.weight = 1500;
        cat.setAge(15);
        //cat.name = null;

        System.out.println(cat.toString());

        cat.saeMeow();
        cat.test();

        String catName = cat.getName();;
        System.out.println(catName);

        System.out.println("cat.getAge " + cat.getAge());

        cat.setName(null);
        System.out.println("=============");
        cat.setName("Max");

        System.out.println(cat.toString());

        cat.eat();
        System.out.println(cat.toString());


    }
}
