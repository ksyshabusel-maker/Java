package org.example;

public class SavingsAccount extends Account {
    private double rate;

    public SavingsAccount(String number, double balance, String owner, double rate) {
        super(number, balance, owner);
        this.rate = rate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * rate / 100;
    }

    @Override
    public void withdraw() {
        System.out.println("Снятие с комиссией 1%");
    }

    @Override
    public void displayInfo() {
        System.out.println("Сберегательный счет");
        super.displayInfo();
        System.out.println("Ставка: " + rate + "%");
        System.out.println("Проценты: " + calculateInterest());
    }
}