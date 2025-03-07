package lesson28__17_12_24Testirovanie_JUnitJupiter.classwork28.persons.test;

import lesson28__17_12_24Testirovanie_JUnitJupiter.classwork28.persons.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person;
    String startEmail = "john@test.com;";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);

        assertEquals(validEmail, person.getEmail());
        assertNotEquals(startEmail, person.getEmail());

    }
    /*
    1. Берем невалидный email
    2. Устанавливаем его сеттером персону
    3. Ожидаемый результат: InvalidEmail установлен не будет
     */

    // testmail.net
    // test@@mail.net

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail){
        person.setEmail(invalidEmail);
        assertNotEquals(invalidEmail, person.getEmail());
        //assertEquals(startEmail, person.getEmail());

    }
    static Stream<String> invalidEmailData(){
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mailnet",
                "test@mailne.t",
                "test@ ma.ilnet"
        );
    }
}
