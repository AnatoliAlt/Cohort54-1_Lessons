package lesson28__17_12_24Testirovanie_JUnitJupiter.classwork28.persons.test;

import lesson27__12_12_24_forEach_Enum.classwork27.enums.days.Day;
import lesson28__17_12_24Testirovanie_JUnitJupiter.classwork28.persons.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {


    // @AfterEach
    // void setUp() {
    //     System.out.println("Метод @BeforeEach");
    // }

    //   @BeforeAll
    //   static void setUp() {
    //       System.out.println("Метод @BeforeAll");
    //   }


    @BeforeEach
    void setUp() {
        System.out.println("Метод @BeforeEach");
    }
    /*
    @BeforeEach - Метод помеченный @BeforeEach будет выполняться перед КАЖДЫМ тестовым методом
    @BeforeAll - Метод помеченный @BeforeAll выполнится только один раз перед выполнением первого теста (требует static),
    а не перед каждым тестовым методом.
    @AfterEach - Метод помеченный @AfterEach, будет выполняться после КАЖДОГО тестового метода.
    @AfterAll - Метод помеченный @AfterAll, выполнится только один раз после последнего тестового метода (требует static).
    @Disabled - Метод помеченный @Disabled указывает, что тест отключен и выполнять метод не требуется. Используется
    для отключения когота теста при тестировании приложения, если все приложение падает из-за ошибки в этом методе.
     */

    // @Test - Анатация указывает, что метод является тестовым. Таким образом JUnit знает,
    // что этот метод нужно запустить во время выполнения тестов.
    @Test
    public void testAddition() {
        System.out.println("Test addition");

        int result = 2 + 2;

        // Методы проверки утверждений.

        // .assertEquals(expected (ожидаемое значение 4), actual (фактическое значение - result (2 + 2));
        Assertions.assertEquals(4, result); // Проверка на равенство двух значений.
        //   assertNotEquals(принимается не ожидаемое значение 9), actual (фактическое значение - result (2 + 2));
        assertNotEquals(9, result);// Тест будет пройден, если принимаемое значение не совподает с фактическим результатом.
        assertTrue(result >= 4); // Метод проверяет, что условие верное (возвращает true).
        assertFalse(result > 4); // Метод проверяет, что условие ложно (возвращает false).
        assertNull(null); // Метод провеояет, что объект равет null.
        assertNotNull("String"); // Метод провеояет, что объект не равет null.

    }

    @Disabled
    @Test // Пустой тестовый метод считается пройденным, так как в методе нет ложного утверждения
    public void emptyTest() {
        System.out.println("Empty test");

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 9, 11})

    public void testNumbers(int number) {
        System.out.println("number = " + number);
        assertTrue(number > 0);

    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    public void testFruit(String fruit) {
        System.out.println("fruit = " + fruit);
        assertTrue(fruit.length() > 2); // Метод проверяет, что количество фруктов больше чем 2
    }
    // apple, 1
    // banana, 2

    // CSV - Coma-Separated-Value - в переводе с английского <Значения разденые запятой>
    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
    void testWitnCsvSourse(String fruit, int rank) {
        System.out.println("fruit: " + fruit + " | " + (rank + 10));
        assertTrue(fruit.length() > 4 && rank > 0);

    }

    // Источник данных файл data.csv.
    // @Disabled
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testwithCsvFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertNotNull(flag);
        assertTrue(rank > 0);
    }

    @ParameterizedTest
    @EnumSource(Day.class)
    void testEnums(Day day) {
        System.out.println("day = " + day);
        assertNotNull(day);
    }

    @ParameterizedTest
    @MethodSource("testDataString")
    public void testWitnMethodSource(String argument) {
        System.out.println("argument = " + argument);
        assertNotNull(argument);
    }

    static Stream<String> testDataString() {
        return Stream.of("apple", "banana", "cherry");
    }

    static Stream<Integer> testInterger() {
        return Stream.of(1, 5, 6, 7, 78, 8);
    }

    @ParameterizedTest
    @MethodSource("testDateArguments")
    void testMethodSourse2(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + " | " + isEquals);
        int result = value * value;
        assertEquals(isEquals, result == expected);

    }

    static Stream<Arguments> testDateArguments() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonDana")
    void testPersonsData(Person person, String email) {
        System.out.println("person = " + person);
        System.out.println("email = " + email);
        System.out.println("==============================");

    }

    static Stream<Arguments> testPersonDana() {
        Person person = new Person("test@mail.net", "pass1Q!4");
        return Stream.of(
                Arguments.of(person, "new123@.net"),
                Arguments.of(new Person("invalid.email.com", "password"), "mail.test.com")
        );
    }


}
