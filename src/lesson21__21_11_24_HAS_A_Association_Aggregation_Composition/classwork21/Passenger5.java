package lesson21__21_11_24_HAS_A_Association_Aggregation_Composition.classwork21;

public class Passenger5 {
    private static int counter; // счетчик - статическая переменная, видимая для всех объектов
    private final int id;
    private String name;

    public Passenger5(String name) {
        this.name = name;
        this.id = counter++; // Написал вручную. Автоматически констуктором не создается
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Passenger5: {");
        sb.append("id: ").append(id);
        sb.append(", name:'").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
