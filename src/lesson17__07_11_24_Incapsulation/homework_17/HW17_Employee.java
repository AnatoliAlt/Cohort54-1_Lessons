package lesson17__07_11_24_Incapsulation.homework_17;

/*
Task 0
Написать класс Employee (Работник)

У него должны быть поля имя, возраст, зарплата

Инкапсулировать класс.

Написать метод info() выводящий информацию о работнике.
 */
public class HW17_Employee {

    private String name;
    private int age;
    private double salary;

    // Создаем конструктор
    public HW17_Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void info() {
        System.out.printf("Employee %s, age: %d, salary: %.2f\n", name, age, salary);

    }

    public String toString() {
        return String.format("Employee %s, age: %d, salary: %.2f\n", name, age, salary);
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
