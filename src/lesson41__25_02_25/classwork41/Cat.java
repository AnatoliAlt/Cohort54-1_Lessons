package lesson41__25_02_25.classwork41;

public class Cat {
    private String name;
    private int weighe;
    private String age;

    public Cat(String name, int weighe, String age) {
        this.name = name;
        this.weighe = weighe;
        this.age = age;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weighe=").append(weighe);
        sb.append(", age='").append(age).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeighe() {
        return weighe;
    }

    public void setWeighe(int weighe) {
        this.weighe = weighe;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
