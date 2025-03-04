package lesson29__19_12_24_equals.classwork29.equals;

import java.util.Objects;

public class Employee {
    private String name;
    private String lastName;
    private int age;

    public Employee(String name, String lestName, int age) {
        this.name = name;
        this.lastName = lestName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLestName() {
        return lastName;
    }

    public void setLestName(String lestName) {
        this.lastName = lestName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Метод сравнения вручную

//    @Override
//    public boolean equals(Object obj) { // (Object obj) - Параметр метода объект и принимает любой тип данных.
//        if (this == obj) return true; // Проверка на сравнение с самим собой.
//        if (obj == null || this.getClass() != obj.getClass())
//            return false; // Прооверка на совпадение классов (типов объектов)
//        Employee employee = (Employee) obj;
//
//        // Сравнение значимых полей
//        //if (!Objects.equals(this.name, employee.name)) return false;
//        //   if (!this.name.equals(employee.name)) return false;
//        // или другой способ
//
//        //    if (!this.name.equals(employee.name)) return false; // Мы получили ошибку NullPointerException
//        if (!Objects.equals(this.name, employee.name)) return false;
//        if (!Objects.equals(this.lastName, employee.lastName)) return false;
//        return this.age == employee.age;
//
//    }

    // Метод сравнения от IDEA JD


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName()) && Objects.equals(lastName, employee.lastName);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (!Objects.equals(name, employee.name)) return false;
        return Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", lestName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
