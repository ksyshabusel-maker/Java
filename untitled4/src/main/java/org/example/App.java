package org.example;

/**
 7. Спортсмены
 Базовый класс: “Sportsman”
 Поля: “name” (имя), “team” (команда), “number” (игровой номер)
 Методы: “getPosition()” (позиция на поле), “displayInfo()”
 Производные классы:
 “Forward” – добавляет поле “goals” (количество голов)
 “getPosition()” → "Нападающий"
 “Goalkeeper” – добавляет поле “saves” (количество сейвов)
 “getPosition()” → "Вратарь"
 Уникальные методы: “scoreGoal()” для Forward, “makeSave()” для Goalkeeper
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Sportsman[] sportsmen = new Sportsman[5];

        sportsmen[0] = new Forward("Алексей", "Спартак", 10, 15);
        sportsmen[1] = new Forward("Иван", "Динамо", 9, 20);
        sportsmen[2] = new Forward("Максим", "Зенит", 7, 12);

        sportsmen[3] = new Goalkeeper("Дмитрий", "Спартак", 1, 30);
        sportsmen[4] = new Goalkeeper("Андрей", "Динамо", 16, 25);

        for (int i = 0; i < sportsmen.length; i++) {
            sportsmen[i].displayInfo();
            System.out.println();
        }

        System.out.println("Демонстрация уникальных методов:");

        ((Forward) sportsmen[0]).scoreGoal();
        ((Forward) sportsmen[1]).scoreGoal();

        ((Goalkeeper) sportsmen[3]).makeSave();
        ((Goalkeeper) sportsmen[4]).makeSave();

    }
}
