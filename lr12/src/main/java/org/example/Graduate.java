package org.example;

public class Graduate extends Student {
    String thesis;

    public Graduate(String name, int id, double grade, String thesis) {
        super(name, id, grade);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return "Магистрант, " + super.toString() + ", Тема работы: " + thesis;
    }
}