package lesson24__03_12_24_Interface.homework24.sport_T1;
/*                         Home Work 24
                               Task 1
Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */
public class Triathlete implements Swimmer, Runner{

    @Override
    public void run() {
        System.out.println("Спортсмен бежит");

    }

    @Override
    public void swim() {
        System.out.println("Спортсмен плывет");

    }
}
