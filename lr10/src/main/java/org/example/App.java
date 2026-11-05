package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Football f1 = new Football("Спартак", "Динамо", 90);
        Football f2 = new Football("ЦСКА", "Локомотив", 90);

        Basketball b1 = new Basketball("Лейкерс", "Буллз", 48);
        Basketball b2 = new Basketball("Реал", "Барселона", 48);
        Basketball b3 = new Basketball("ЦСКА", "Зенит", 48);

        f1.play();
        f1.score();
        System.out.println("Счёт: " + f1.getTeam1() + " " + f1.getScore() + " " + f1.getTeam2());
        System.out.println();

        f2.play();
        f2.score();
        System.out.println("Счёт: " + f2.getTeam1() + " " + f2.getScore() + " " + f2.getTeam2());
        System.out.println();

        b1.play();
        b1.score();
        System.out.println("Счёт: " + b1.getTeam1() + " " + b1.getScore() + " " + b1.getTeam2());
        System.out.println();

        b2.play();
        b2.score();
        System.out.println("Счёт: " + b2.getTeam1() + " " + b2.getScore() + " " + b2.getTeam2());
        System.out.println();

        b3.play();
        b3.score();
        System.out.println("Счёт: " + b3.getTeam1() + " " + b3.getScore() + " " + b3.getTeam2());

    }
}
