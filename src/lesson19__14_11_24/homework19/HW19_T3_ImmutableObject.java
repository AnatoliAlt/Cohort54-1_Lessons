package lesson19__14_11_24.homework19;
/*                        Home Work 19
                             Task 3
Неизменяемый объект
Создайте класс ImmutablePoint:

•	Объявите final поля x и y типа int.
•	Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
 */

public class HW19_T3_ImmutableObject {
    final int x;
    final int y;

    public HW19_T3_ImmutableObject(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Сеттеры для изменения значений создать не возможно или
    // программа сломается и выдаст ошибку компиляции.
    public void setX(){
        return ; //  return x;
    }
    public void setY(){
        return ; // return y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
