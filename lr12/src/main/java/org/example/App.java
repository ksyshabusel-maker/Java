package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Comparator;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Студенты");
            System.out.println("2. Рестораны");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Задание 1. Студенты

                    Map<String, Student> students = new HashMap<>();

                    students.put("Алексей", new Undergraduate("Алексей", 1, 8.5, 2));
                    students.put("Иван", new Undergraduate("Иван", 2, 7.5, 3));
                    students.put("Мария", new Undergraduate("Мария", 3, 9.0, 1));

                    students.put("Анна", new Graduate("Анна", 4, 8.0, "Искусственный интеллект"));
                    students.put("Дмитрий", new Graduate("Дмитрий", 5, 9.0, "Разработка игр"));
                    students.put("Елена", new Graduate("Елена", 6, 8.5, "Базы данных"));

                    students.put("Сергей", new PhD("Сергей", 7, 9.5, 10));
                    students.put("Ольга", new PhD("Ольга", 8, 9.0, 15));

                    System.out.println("Все студенты:");

                    for (String name : students.keySet()) {
                        System.out.println("Ключ: " + name);
                        System.out.println("Значение: " + students.get(name));
                        System.out.println();
                    }
                    break;

                case 2:
                    // Задание 2. Рестораны

                    List<Restaurant> restaurants = new ArrayList<>();

                    restaurants.add(new Restaurant(1, "Бриз", "Европейская", 3,
                            new ArrayList<>(List.of(2, 3, 2))));

                    restaurants.add(new Restaurant(2, "Атлант", "Итальянская", 4,
                            new ArrayList<>(List.of(4, 5, 5))));

                    restaurants.add(new Restaurant(3, "Восток", "Азиатская", 3,
                            new ArrayList<>(List.of(3, 4, 4))));

                    restaurants.add(new Restaurant(4, "Гурман", "Французская", 5,
                            new ArrayList<>(List.of(5, 5, 4))));

                    restaurants.add(new Restaurant(5, "Маяк", "Белорусская", 2,
                            new ArrayList<>(List.of(2, 2, 3))));

                    // Удаление ресторанов со средним рейтингом < 3
                    for (int i = restaurants.size() - 1; i >= 0; i--) {
                        if (restaurants.get(i).getAverageReview() < 3) {
                            restaurants.remove(i);
                        }
                    }

                    // Повышение звездности ресторанов со средним рейтингом >= 4
                    for (int i = 0; i < restaurants.size(); i++) {
                        if (restaurants.get(i).getAverageReview() >= 4) {
                            restaurants.get(i).setStars(restaurants.get(i).getStars() + 1);
                        }
                    }

                    // Печать ресторанов с определенной звездностью
                    System.out.println("Рестораны с 5 звездами:");
                    printRestaurants(restaurants, 5);

                    // Сортировка по убыванию среднего рейтинга
                    for (int i = 0; i < restaurants.size() - 1; i++) {
                        for (int j = 0; j < restaurants.size() - i - 1; j++) {
                            double first = restaurants.get(j).getAverageReview();
                            double second = restaurants.get(j + 1).getAverageReview();

                            if (first < second ||
                                    (first == second &&
                                            restaurants.get(j).getName().compareToIgnoreCase(
                                                    restaurants.get(j + 1).getName()) > 0)) {

                                Restaurant temp = restaurants.get(j);
                                restaurants.set(j, restaurants.get(j + 1));
                                restaurants.set(j + 1, temp);
                            }
                        }
                    }

                  restaurants.sort(Comparator.comparingDouble(Restaurant::getAverageReview).reversed().thenComparing(Restaurant::getName));
                    System.out.println();
                    System.out.println("Рестораны после сортировки:");

                    for (int i = 0; i < restaurants.size(); i++) {
                        System.out.println("ID: " + restaurants.get(i).getId()
                                + ", Название: " + restaurants.get(i).getName()
                                + ", Средний рейтинг: "
                                + restaurants.get(i).getAverageReview());
                    }
                    break;

                case 0:
                    System.out.println("Выход.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Нет такого пункта.");
            }

            System.out.println();
        }
    }

    public static void printRestaurants(List<Restaurant> restaurants, int stars) {
        for (int i = 0; i < restaurants.size(); i++) {
            if (restaurants.get(i).getStars() == stars) {
                System.out.println(restaurants.get(i).getId() + ". "
                        + restaurants.get(i).getName()
                        + " — " + restaurants.get(i).getStars() + " звезд");
            }
        }
    }
}
