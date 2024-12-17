package lesson27__12_12_24.classwork27.enums.colors;

import lesson27__12_12_24.classwork27.enums.colors.Color;

public class Auto {
    private String model;
    private Color color;

    public Auto(String model, Color color) {
        this.model = model;
        this.color = color;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Auto{");
        sb.append("model='").append(model).append('\'');
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }




}
