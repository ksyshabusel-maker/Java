package org.example;

public class Undergraduate extends Student {
    int year;

    public Undergraduate(String name, int id, double grade, int year) {
        super(name, id, grade);
        this.year = year;
    }

    @Override
    public String toString() {
        return "Бакалавр, " + super.toString() + ", Курс: " + year;
    }
}