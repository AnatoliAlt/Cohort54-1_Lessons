package lesson21__21_11_24_HAS_A_Association_Aggregation_Composition.classwork21;

public class BusDriver2 {

    private static int idCounter = 100; // счетчик - подсчета id водителей (начинается со 100)
    private final int id; // индификационный номер водителя
    private String name; // имя водителя
    private String LicenseNumber; // номер лицензии

    public BusDriver2(String name, String licenseNumber) {
        this.id = idCounter++; // Написал вручную. Автоматически констуктором не создается
        this.name = name;
        this.LicenseNumber = licenseNumber;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("BusDriver: {");
        sb.append("id: ").append(id);
        sb.append(", name: ").append(name);
        sb.append("}");

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

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        LicenseNumber = licenseNumber;
    }
}
