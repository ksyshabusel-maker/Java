package org.example;

public class Product {
    String name;
    double price;
    double weight;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public void sell() {
        System.out.println("Продаю товар");
    }

    public void sell(int quantity) {
        System.out.println("Продаю " + quantity + " шт.");
    }

    public void sell(double discount) {
        System.out.println("Продаю со скидкой " + discount + "%");
    }

    public double getDiscount() {
        return 0;
    }
}