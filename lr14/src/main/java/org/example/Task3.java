package org.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void execute() {
        System.out.println("\n--- Задание 3 ---");
        Random random = new Random();
        File f = new File("f3.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");

        try (PrintWriter writer = new PrintWriter(f)) {
            for (int i = 0; i < 10; i++) {
                writer.println(random.nextInt(200) + 1);
            }
        } catch (IOException e) {
            System.out.println("Ошибка создания f3.txt");
            return;
        }

        // Читаем f3 и распределяем по g и h
        try (Scanner scanner = new Scanner(f);
             PrintWriter writerG = new PrintWriter(g);
             PrintWriter writerH = new PrintWriter(h)) {

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num < 100) {
                    writerG.println(num);
                } else {
                    writerH.println(num);
                }
            }
            System.out.println("Числа из f3.txt распределены в g.txt (<100) и h.txt (>=100)");
        } catch (IOException e) {
            System.out.println("Ошибка обработки: " + e.getMessage());
        }
    }
}