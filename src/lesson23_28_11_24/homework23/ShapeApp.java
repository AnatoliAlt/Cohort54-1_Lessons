package lesson23_28_11_24.homework23;
/* Home Work 23
                            Task 1
Создайте абстрактный класс Shape (Форма) с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle (Круг), Rectangle (Прямоугольник), и Triangle (Треугольник).
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */
public class ShapeApp {
    public static void main(String[] args) {

        Figure figure = new Figure();


        Circle circle = new Circle();
        circle.radius = 3;
        figure.calcArea( circle);
        circle.calculationPerimetr();

        Rectangle rectangle = new Rectangle();
        rectangle.length = 5;
        rectangle.width = 3;
        figure.calcArea(rectangle);
        rectangle.calculationPerimetr();


    }
}
