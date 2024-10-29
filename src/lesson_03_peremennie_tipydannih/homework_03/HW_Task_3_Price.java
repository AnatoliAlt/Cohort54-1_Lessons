package lesson_03_peremennie_tipydannih.homework_03;
/*
Task 3 * (Опционально)
Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.

Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.

Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
 */

public class HW_Task_3_Price {
    public static void main(String[] args) {

        double costOfShirts = 1000;// Стоимость рубашек
        double costOfTies = 500;// Стоимость галстуков
        double discount = 10;

        double sum = costOfShirts + costOfTies;// Общая стоимость товаров
        System.out.println("Total cost of goods: " + sum + " (Общая стоимость товаров)");

        double discountOnGoods = sum * 0.1;// Скидка на товары
        System.out.println("Discount on goods: " + discountOnGoods + " (Скидка на товары 10%)");

        double discountedPrice = sum - discountOnGoods;// Стоимость со скидкой
        System.out.println("Discounted Price: " + discountedPrice + " (Стоимость со скидкой)");

        double priceWithDiscount = (costOfShirts + costOfTies) * (100 - discount) / 100;
        System.out.println("priceWithDiscount " + priceWithDiscount);// Стоимость со скидкой 2
    }
}
