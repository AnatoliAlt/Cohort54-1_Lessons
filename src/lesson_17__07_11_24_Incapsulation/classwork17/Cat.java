package lesson_17__07_11_24_Incapsulation.classwork17;

public class Cat {

    //String name;
    //int age;
    //int weight;

    private String name;
    private int age;
    protected int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;


    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Не коректное значение имени!");
            return;
            //System.out.println("Afto return");
        }//else {
        this.name = name;
        //}

    }

    public void setAge(int age) {
        if (age >= 0 && age < 20) {
            this.age = age;
        }
    }

    public void eat() {
        System.out.println("Кот кушает");
        weight++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void saeMeow() {
        System.out.println("Cat says meow");
    }

    public String toString() {
        return "Cat " + name + ", age: " + age + ", weight:  " + weight;
    }

    public String test() {
        return "Cat " + name + ", age: " + age + ", weight:  " + weight;
    }
}
