package lesson43__04_03_25.homework43;

public class PersonPasApp {
    public static void main(String[] args) {
        PersonPas person = new PersonPas("john@email.com", "qwlA@y.t$");
        System.out.println(person);
        System.out.println("=====================");
        PersonPas person2 = new PersonPas("john@email.com", "SUHU@243");
        System.out.println(person2);
        System.out.println("=====================");
        PersonPas personpas3 = new PersonPas("john@email.com", "qwerty");
        System.out.println(personpas3);
        System.out.println("=====================");
        PersonPas person1 = new PersonPas("john@email.com", "qwF!9erty");
        System.out.println("Ваш пароль: " + person1);


    }
}
