package lesson07_01_10_24_if_Switch_StringEquals.homework;
/*                                             Home Work 7
                                            Task 5 * (Опционально)

Используйте оператор switch для решения задачи:

1. Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.

Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.

P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
*/

import java.util.Random;

public class HW_07Task_5_SchoolMark {
    public static void main(String[] args) {
        System.out.println("__________________________________________________");
        System.out.println(" Home Work 7                        Task 5");
        // 1. Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.

        Random random = new Random();
        int mark = random.nextInt(13);
        System.out.println("Оценка в школе: " + mark);
        int maxTvMinutes = 60; // Минут (на просмотр tv)
        int timeRemaining = 45; // Остаток времени
        int timeRemaining1 = timeRemaining;

        switch (mark) {
            case 10, 11, 12:
                System.out.println("Klass!!! 45 минут плюс 60 минут");
                timeRemaining += 60;
                break;
            case 7, 8, 9:
                System.out.println("Хорошо! 45 минут плюс 45 минут");
                timeRemaining += 45;
                break;
            case 4, 5, 6:
                System.out.println("Нормально! 45 минут плюс 15 минут");
                timeRemaining += 15;
                break;
            case 3:
                System.out.println("Плохо! 45 минут минус 30 минут");
                timeRemaining -= 30;
                break;
            case 1, 2:
                System.out.println("Очень плохо! Запрет на просмотр телевизора на один день.");
                timeRemaining = 0;
                break;
            case 0:
                System.out.println("Ребенок сегодня в школе оценку не получил!");

        }
        System.out.println("Время на просмотр телевизора: " + timeRemaining + " минут");

        if (timeRemaining >= maxTvMinutes) {
            System.out.println("Остаток времени для просмотра телевизра на следующий день: " + (timeRemaining -= maxTvMinutes));
        } else {
            System.out.println("Остаток времени на просмотр телевизора c прошлого дня: " + (timeRemaining1) + " минут.");
        }
        System.out.println("P.S. Максимальное время для просматра TV в день: " + (maxTvMinutes) + " минут!");
        System.out.println("______________________________________________________________________________");
    }
}
