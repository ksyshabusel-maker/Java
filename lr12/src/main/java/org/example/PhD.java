package org.example;

public class PhD extends Student {
    int publications;

    public PhD(String name, int id, double grade, int publications) {
        super(name, id, grade);
        this.publications = publications;
    }

    @Override
    public String toString() {
        return "Аспирант, " + super.toString()
                + ", Публикаций: " + publications;
    }
}