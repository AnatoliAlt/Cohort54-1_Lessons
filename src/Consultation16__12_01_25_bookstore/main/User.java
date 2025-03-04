package Consultation16__12_01_25_bookstore.main;

public class User {
    private final int id;
    private String email;
    private String password;
    private final int age;

    public User(int id, String email, String password, int year) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.age = year;
    }


    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getYear() {
        return age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", year=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
