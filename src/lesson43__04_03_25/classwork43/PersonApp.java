package lesson43__04_03_25.classwork43;

public class PersonApp {
    public static void main(String[] args) {


        Person person = new Person("john@email.com", "qw2erty");
        System.out.println(person);

        System.out.println("\n==========");

        Person testPerson = new Person("john.email.com", "qw2erty");
        System.out.println(testPerson);

        System.out.println("\n==========");

        testPerson = new Person("john@ema%il.com", "qwerty");
        System.out.println(testPerson);

        System.out.println("\n==========");
        testPerson = new Person("@john.email.com", "qwerty");
    }
}
