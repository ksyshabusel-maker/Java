package org.example;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void execute() {
        System.out.println("\n--- Задание 1 ---");
        File file = new File("family.txt");


        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("Семья Ивановых:");
            writer.println("Отец: Иван, 45 лет, инженер");
            writer.println("Мать: Мария, 42 года, учитель");
            writer.println("Сын: Алексей, 15 лет, школьник");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }


        System.out.println("Данные о файле:");
        System.out.println("Имя: " + file.getName() + ", Размер: " + file.length() + " байт");


        System.out.println("Содержимое файла:");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}