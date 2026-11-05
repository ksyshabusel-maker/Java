package org.example;

/**
 7. Смартфоны
 Создайте класс “Smartphone”:
 Нестатические: “model”, “memory”, “cameraMP”
 Статические: “totalPhones”, “totalMemory”
 Статический метод “getAverageMemory()”
 В “main” создайте 5 смартфонов и выведите среднюю память
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Smartphone phone1 = new Smartphone("Samsung", 128, 50);
        Smartphone phone2 = new Smartphone("iPhone", 256, 48);
        Smartphone phone3 = new Smartphone("Xiaomi", 128, 108);
        Smartphone phone4 = new Smartphone("Huawei", 256,209 );
        Smartphone phone5 = new Smartphone("Google Pixel", 128, 50);

        System.out.println("Средняя память: " + Smartphone.getAverageMemory() + " ГБ");
        phone1.test1();
        Smartphone.test();
    }
}
