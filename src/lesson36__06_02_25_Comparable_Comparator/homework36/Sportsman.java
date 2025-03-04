package lesson36__06_02_25_Comparable_Comparator.homework36;

import org.jetbrains.annotations.NotNull;

public class Sportsman implements Comparable<Sportsman> {

    private String name;
    private int age;
    private int score; // рейтинг

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    // Comparable -> Метод сравнения текущего объекта Sportsman с другим объектом Sportsman Sportsman1

    @Override
    public int compareTo(Sportsman Sportsman1) {
        return this.age - Sportsman1.getAge();
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sportsman{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }

}
/*
Task 1
Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг).

Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name.

Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому
критерию, например, по score.

В методе main создайте массив из нескольких объектов Sportsman.

Отсортируйте его с использованием:

естественного порядка, определенного в Comparable,
данного класса Comparator,
анонимного класса Comparator для сортировки по третьему полю (например, age).
Выведите каждый вариант отсортированного массива в консоль.

Task 2 * ОПЦИОНАЛЬНО
Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых
чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur
Copy
Task 3 * ОПЦИОНАЛЬНО
Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Outpur
Copy
Task 4 * ОПЦИОНАЛЬНО
Доп дз по желанию:

Отсортировать машины по году выпуска, если год равен - отсортировать по модели в обратном порядке
Отсортировать машины по году выпуска, если год равен - отсортировать по максимальной скорости в порядке возрастания
 */
