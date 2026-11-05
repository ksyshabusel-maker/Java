package org.example;
import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        /*
        7. Класс “Квартира” (Apartment): Поля: “address”, “rooms” (int), “area”
(double). Конструктор. Геттеры и сеттеры. Метод “pricePerSquareMeter(double
totalPrice)”. В “main” создать квартиру и вывести цену за квадратный метр.
         */
    Scanner scanner = new Scanner(System.in);

    Apartment apartment = new Apartment(
            "ул. Пушкина, д. 10",
            3,
            65.5
    );

        System.out.println("Адрес: " + apartment.getAddress());
        System.out.println("Количество комнат: " + apartment.getRooms());
        System.out.println("Площадь: " + apartment.getArea());

        System.out.print("Введите общую стоимость квартиры: ");
    double totalPrice = scanner.nextDouble();

    double price = apartment.pricePerSquareMeter(totalPrice);

        System.out.println("Цена за квадратный метр: " + price);
Apartment apartment1= new  Apartment("df",3,2,1);
        scanner.close();
}

}


