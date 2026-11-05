package org.example;

/**
 * 7. Банковские счета
 * Абстрактный класс: “Account”
 * - Поля: “number” (номер), “balance” (баланс), “owner” (владелец)
 ** 8
 * - Абстрактные методы: “calculateInterest()” (начислить проценты),
 * “withdraw()” (снять)
 * - Конкретный метод: “displayInfo()”
 * Конкретные классы:
 * 1. “SavingsAccount” – добавляет поле “rate” (ставка)
 * - “calculateInterest()” → баланс * rate / 100
 * - “withdraw()” → "Снятие с комиссией 1%"
 * 2. “CheckingAccount” – добавляет поле “overdraftLimit” (лимит)
 * - “calculateInterest()” → 0 (без процентов)
 * - “withdraw()” → "Снятие без комиссии"
 * Задание: Создайте 2 сберегательных и 3 расчетных счета, выведите проценты.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Account[] accounts = new Account[5];

        accounts[0] = new SavingsAccount("1001", 1000, "Алексей", 5);
        accounts[1] = new SavingsAccount("1002", 2000, "Иван", 7);

        accounts[2] = new CheckingAccount("2001", 500, "Мария", 300);
        accounts[3] = new CheckingAccount("2002", 1500, "Анна", 500);
        accounts[4] = new CheckingAccount("2003", 3000, "Дмитрий", 1000);

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayInfo();
            accounts[i].withdraw();
            System.out.println();
        }

        System.out.println("Попытка создать объект Account невозможна,");
        System.out.println("так как класс является абстрактным.");

    }
}
