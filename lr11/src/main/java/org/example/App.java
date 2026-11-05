package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Product product = new Product("Книга", 30, 0.5);
        Electronics electronics = new Electronics("Телефон", 1200, 0.2);
        Food food = new Food("Шоколад", 5, 0.1);

        System.out.println("Обычный товар:");
        product.sell();
        product.sell(3);
        product.sell(10.0);
        System.out.println("Скидка: " + product.getDiscount() + "%");

        System.out.println();

        System.out.println("Электроника:");
        electronics.sell();
        electronics.sell(2);
        electronics.sell(electronics.getDiscount());
        System.out.println("Скидка: " + electronics.getDiscount() + "%");

        System.out.println();

        System.out.println("Продукты питания:");
        food.sell();
        food.sell(5);
        food.sell(food.getDiscount());
        System.out.println("Скидка: " + food.getDiscount() + "%");
    }

}
