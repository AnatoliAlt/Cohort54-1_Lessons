package lesson17__07_11_24_Incapsulation.classwork17;

public class Cats {

    private String name;
    private int age;
    private int weight;


    public Cats(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    // set - Установить что-то

    // set - на имя
    // Проверяем, подходит нам или нет то что прислал нам пользователь
    public void setName(String name) {
        if (name == null || name.isEmpty()) {// name.isEmpty() - Пустое имя
            System.out.println("не карректное значение имени!");
            return; // return - Ипользуется для прекращения работы метода и не одна команда в ->
            // -> этом методе больше работать не будет
        } // else {// Можно блок else не писать и делаемся чаще всего
        // Имя подходит - установить в соответствующее поле
        this.name = name;

    }

    // set - на возраст
    // Проверка, подходит нам возраст или нет
    public void setAge(int age) {
        if (age >= 0 && age < 20){
            // age - подходит - устанавливаем в свойства объекта ( в поля)
            this.age = age;
        }
    }
    // метод когда котик кушает и его вес повышается на 1
    public  void  eat(){
        System.out.println("Котик кушает");
        weight++;
    }

    // get - это взять что-то
    // Возврашаем поле (private) name с помощью get

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Если по какойто причине я не хочу давать значение веса кота ->
    // -> значит просто не пишу геттер для этого поля
    // public int getAge(){
    //     return age;
    // }
    public int getWeight() {
        return weight;
    }

    public void seyMeow() {
        System.out.println("Cat seys meow");
        test();// В классе мы можем вызвать метод "test"
    }

    public String toString() {
        return "Cat: " + name + ", age: " + age + ", weight:" + weight;

    }

    private void test() {
        System.out.println("Test");

    }

}
