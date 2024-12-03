package lesson23_28_11_24.homework23;
/*                   Home Work 23
                        Task 1
Создайте абстрактный класс Shape (Форма) с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle (Круг), Rectangle (Прямоугольник), и Triangle (Треугольник).
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
        */
public class Rectangle extends HW23_Shape{ // (Прямоугольник)

    double length;
    double width;
    @Override
    public void calculationArea() { // area - площадь
        System.out.println("Площадь прямоугольника: " + length * width);
    }

    @Override
    public void calculationPerimetr() { // perimetr - периметр
        System.out.println("Периметр поямоугольника: " + (length + width) * 2);

    }




}
