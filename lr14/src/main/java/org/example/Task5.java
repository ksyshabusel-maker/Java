package org.example;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void execute() {
        System.out.println("\n--- Задание 5 ---");
        Random random = new Random();
        File f = new File("f5.txt");

        try (PrintWriter writer = new PrintWriter(f)) {
            for (int i = 0; i < 10; i++) {
                writer.println(random.nextInt(100) + 1);
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int count = 0;
        System.out.print("Числа в файле f5.txt: ");
        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.print(num + " ");
                if (num % 2 == 0 && num % 3 == 0) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
        System.out.println("\nКратных 2 и 3 одновременно: " + count);
    }
}