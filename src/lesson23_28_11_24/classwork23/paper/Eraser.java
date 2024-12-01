package lesson23_28_11_24.classwork23.paper;

public class Eraser  extends Pen{ // Стирательная резинка
    @Override
    public void draw(String figureName) {
        System.out.println("Стираю фигуру " + figureName);
    }
}
