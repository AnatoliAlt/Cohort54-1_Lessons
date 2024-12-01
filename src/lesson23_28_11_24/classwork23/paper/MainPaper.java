package lesson23_28_11_24.classwork23.paper;

public class MainPaper {
    public static void main(String[] args) {

        Paper paper = new Paper(); // Создаем объект бумага

        Pencil pencil = new Pencil(); // Создаем объект карандаш

        // Кастинг - Позволяет мне передать в метод drawFigure
        // объект любого дочернего класса.
        Pen pen = new Brush();

        // Вызываем метод рисовать фигуру
        paper.drawFigure("Квадрат", pencil);

        paper.drawFigure("Овал", new Brush());

        paper.drawFigure("Овал", new Eraser());

        paper.drawFigure("Квадрат", new Marker());

        ColorPencil colorPencil = new ColorPencil();
        paper.drawFigure("Солнышко", colorPencil);
        colorPencil.setColor("Yellow"); // Желтый (цвет)
        paper.drawFigure("Трава", colorPencil);

        System.out.println("======= Создаем массив ========================\n");

        Pen[] pens = new Pen[]{pencil, new Brush(), new Eraser(), new Marker(), colorPencil};
        for (int i = 0; i < pens.length; i++) {
            paper.drawFigure("Радуга", pens[i]);

        }


    }
}
