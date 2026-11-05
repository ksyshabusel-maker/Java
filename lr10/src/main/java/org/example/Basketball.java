package org.example;

public class Basketball implements Playable, Scorable{
    private String team1;
    private String team2;
    private int duration;
    private String score;

    public Basketball(String team1, String team2, int duration) {
        this.team1 = team1;
        this.team2 = team2;
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Баскетбольный матч: " + team1 + " - " + team2
                + ", длительность: " + duration + " мин");
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void score() {
        int p1 = 70 + (int) (Math.random() * 51);
        int p2 = 70 + (int) (Math.random() * 51);
        score = p1 + ":" + p2;
    }

    @Override
    public String getScore() {
        return score;
    }

    public String getTeam1() { return team1; }
    public String getTeam2() { return team2; }
}
