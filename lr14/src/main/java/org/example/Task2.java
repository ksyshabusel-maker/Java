package org.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void execute(Scanner console) {
        System.out.println("\n--- Задание 2 ---");
        File file = new File("f2.txt");


        try (PrintWriter writer = new PrintWriter(file)) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                writer.println(console.nextInt());
            }
            console.nextLine();
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }


        int positiveCount = 0;
        System.out.print("Числа в файле: ");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num > 0) positiveCount++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
        System.out.println("\nПоложительных чисел: " + positiveCount);
    }
}