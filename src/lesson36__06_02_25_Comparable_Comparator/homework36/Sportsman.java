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
// Comparable -> Метод сравнения текущего объекта Sportsman с другим объектом Sportsman Sportsman1

    @Override
    public int compareTo(Sportsman Sportsman1) {
        return this.age - Sportsman1.getAge();
    }
}
