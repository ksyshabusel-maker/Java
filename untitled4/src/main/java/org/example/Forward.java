package org.example;

public class Forward extends Sportsman {
    private int goals;

    public Forward(String name, String team, int number, int goals) {
        super(name, team, number);
        this.goals = goals;
    }

    @Override
    public String getPosition() {
        return "Нападающий";
    }

    public void scoreGoal() {
        goals++;
        System.out.println("Гол! Всего голов: " + goals);
    }
}