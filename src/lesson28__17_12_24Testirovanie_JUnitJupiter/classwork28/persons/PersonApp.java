package lesson28__17_12_24Testirovanie_JUnitJupiter.classwork28.persons;

import lesson28__17_12_24Testirovanie_JUnitJupiter.classwork28.persons.Person;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("test@ema.il", "fQWWERERR1]");
        System.out.println("Ожидаемые символы ! % $ @ & * () []");
        System.out.println(person);


       Character.isLowerCase('v'); //  Нижний регистр
       Character.isUpperCase('V'); // Верхний регистр
       Character.isDigit('v');

       boolean isDigit;
       boolean isLowerCase;

        // Если все три вернут true - то тогда нам выдаст, что пароль вкрный
        // Пример - return isDigit && isLowerCase && isLowerCase;
    }
}
