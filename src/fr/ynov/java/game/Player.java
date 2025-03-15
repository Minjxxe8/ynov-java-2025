package fr.ynov.java.game;

import java.util.Scanner;

public class Player {
    String name;
    int score;

    public Player(String name) {
        this.name = getName();
        this.score = 0;
    }

    public String getName() {
        Scanner name = new Scanner(System.in);
        System.out.println("What's your name ? : ");
        String nameInput = name.nextLine();
        System.out.println("Good luck " + nameInput + " !");
        return nameInput;
    }

    public int getScore() {
        return score;
    }
}
