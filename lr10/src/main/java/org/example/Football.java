package org.example;

public class Football implements Playable, Scorable {
    private String team1;
    private String team2;
    private int duration;
    private String score;

    public Football(String team1, String team2, int duration) {
        this.team1 = team1;
        this.team2 = team2;
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Футбольный матч: " + team1 + " - " + team2
                + ", длительность: " + duration + " мин");
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void score() {
        int g1 = (int) (Math.random() * 5);
        int g2 = (int) (Math.random() * 5);
        score = g1 + ":" + g2;
    }

    @Override
    public String getScore() {
        return score;
    }

    public String getTeam1() { return team1; }
    public String getTeam2() { return team2; }

}
