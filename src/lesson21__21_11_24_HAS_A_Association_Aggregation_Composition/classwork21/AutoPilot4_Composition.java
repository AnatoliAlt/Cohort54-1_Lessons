package lesson21__21_11_24_HAS_A_Association_Aggregation_Composition.classwork21;

public class AutoPilot4_Composition {

    private String softwareVersion;
    private Autobus1 autobus1;

    public Autobus1 getAutobus1() {
        return autobus1;
    }

    public void setAutobus1(Autobus1 autobus1) {
        this.autobus1 = autobus1;
    }

    public AutoPilot4_Composition(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoPilot{ ");
        sb.append("SV: '").append(softwareVersion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
