package lesson18__12_11_24_Modification_Static_Infiniti.homework18;
/*                              Home Work 18
                                   Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять
базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:
Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
 */
public class HW18_Calculator {
    private int  a = 12;
    private int b = 6;

   public int getA() {
       return a;
   }

   public void setA(int a) {
       this.a = a;
   }

   public int getB() {
       return b;
   }

   public void setB(int b) {
       this.b = b;
   }
    // Сложение
    public static int plus(int a, int b){
        return a + b;
    }
    // Вычитение
    public static int minus(int a, int b){
        return a - b;
    }
    // Умножение
    public static int multiplication(int a, int b){
        return a * b;
    }
    // Деление
    public static int division(int a, int b){
        return a / b;
    }
}
