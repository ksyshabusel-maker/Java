package org.example;

public class Goalkeeper extends Sportsman {
    private int saves;

    public Goalkeeper(String name, String team, int number, int saves) {
        super(name, team, number);
        this.saves = saves;
    }

    @Override
    public String getPosition() {
        return "Вратарь";
    }

    public void makeSave() {
        saves++;
        System.out.println("Сейв! Всего сейвов: " + saves);
    }
}