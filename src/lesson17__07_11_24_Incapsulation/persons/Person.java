package lesson17__07_11_24_Incapsulation.persons;

public class Person {

    private String name;
    private int age;
    private String hobby;

    public Person(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;


    }

    public String toString() {
        // Формирование строки по шаблону с подстановкой значений
        return String.format("Person: %s, %d, Hobby: %s", name, age, hobby);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}