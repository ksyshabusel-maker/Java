package org.example;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String number, double balance, String owner, double overdraftLimit) {
        super(number, balance, owner);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public void withdraw() {
        System.out.println("Снятие без комиссии");
    }

    @Override
    public void displayInfo() {
        System.out.println("Расчетный счет");
        super.displayInfo();
        System.out.println("Лимит овердрафта: " + overdraftLimit);
        System.out.println("Проценты: " + calculateInterest());
    }
}