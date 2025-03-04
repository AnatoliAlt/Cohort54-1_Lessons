package Consultation16__12_01_25_bookstore.main.model;

public class Goods {
    public static int counter = 1;

    String name;
    CategoryGoods category;
    double price;
    int id;

    public Goods(String name, CategoryGoods category, double price, int id) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.id = counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Goods.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryGoods getCategory() {
        return category;
    }

    public void setCategory(CategoryGoods category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Goods{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", category=").append(category);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
