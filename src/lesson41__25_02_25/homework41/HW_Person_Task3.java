package lesson41__25_02_25.homework41;
/*                      Home Work 41
                           Task 3
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
 */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HW_Person_Task3 {
    public static void main(String[] args) {
        streamSortPerson();
    }

    private static void streamSortPerson() {
        Person person1 = new Person("Ivan", 25, "Munich");
        Person person2 = new Person("Vladimir", 30, "Frankfurt");
        Person person3 = new Person("Maksim", 45, "Munich");
        Person person4 = new Person("Sergey", 16, "Berlin");
        Person person5 = new Person("Sergey", 55, "Munich");

        Person[] persons = {person1, person2, person3, person4, person5};
     //   System.out.println("Cписок людей: " + Arrays.toString(persons));

        List<Person> personList = Arrays.stream(persons)
                .filter(person -> person.getAge() > 26)

                .peek(person -> System.out.println("Старше 26 лет: " + person))

                .filter(person -> person.getCity().equals("Munich"))
                .peek(person -> System.out.println("Проживает в городе : " + person))
                .collect(Collectors.toList());
        System.out.println("Список людей старше 26 лет и проживающих в городе Munich: " + personList);

    }

}
