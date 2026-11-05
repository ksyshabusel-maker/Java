package org.example;

public class Student {
    String name;
    int id;
    double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Оценка: " + grade;
    }
}