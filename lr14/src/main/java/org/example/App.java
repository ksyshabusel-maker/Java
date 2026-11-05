package org.example;
import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
                Scanner console = new Scanner(System.in);

                while (true) {
                    System.out.println("МЕНЮ ЗАДАНИЙ");
                    System.out.println("1. Информация о семье");
                    System.out.println("2. Ввод 10 чисел и подсчет положительных");
                    System.out.println("3. Разделение случайных чисел на два файла");
                    System.out.println("4. Средняя концентрация вещества");
                    System.out.println("5. Поиск чисел, кратных 2 и 3 одновременно");
                    System.out.println("0. Выход");
                    System.out.print("Выберите задание: ");


                    if (!console.hasNextInt()) {
                        System.out.println("Ошибка: введите число от 0 до 5.");
                        console.next();
                        continue;
                    }

                    int choice = console.nextInt();
                    console.nextLine();

                    switch (choice) {
                        case 1:
                            Task1.execute();
                            break;
                        case 2:
                            Task2.execute(console);
                            break;
                        case 3:
                            Task3.execute();
                            break;
                        case 4:
                            Task4.execute(console);
                            break;
                        case 5:
                            Task5.execute();
                            break;
                        case 0:
                            System.out.println("Выход из программы.");
                                                        return;
                        default:
                            System.out.println("Нет такого пункта меню.");
                    }
                }
            }
        }