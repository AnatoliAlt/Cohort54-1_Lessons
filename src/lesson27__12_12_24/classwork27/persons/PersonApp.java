package lesson27__12_12_24.classwork27.persons;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("test@ema.il", "password");
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
