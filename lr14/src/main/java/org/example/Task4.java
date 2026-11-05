package org.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task4 {
    public static void execute(Scanner console) {
        System.out.println("Задание 4 ");
        File file = new File("concentration.txt");

        try (PrintWriter writer = new PrintWriter(file)) {
            System.out.println("Введите 15 значений концентрации (только положительные числа или 0):");

            for (int i = 0; i < 5; i++) {
                double value;

                while (true) {
                    System.out.print("Значение " + (i + 1) + ": ");

                    if (console.hasNextDouble()) {
                        value = console.nextDouble();

                        if (value >= 0) {
                            break;
                        } else {
                            System.out.println("Ошибка: концентрация не может быть отрицательной. Попробуйте снова.");
                        }
                    } else {
                        System.out.println("Ошибка: введите число (буквы недопустимы).");
                        console.next();
                    }
                }
                writer.println(value);
            }
            console.nextLine();

        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        double sum = 0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
            return;
        }

        if (count > 0) {
            System.out.printf("Средняя концентрация: %.2f%n", (sum / count));
        }
    }
}