package fr.ynov.java.game;

import java.util.Scanner;

public class Player {
    String name;
    int score;

    public Player() {
        this.name = getName();
        this.score = 0;
    }

    public String getName() {

        Scanner name = new Scanner(System.in);
        System.out.println("Choose a Username ? : ");
        String nameInput = name.nextLine().trim();

        while (nameInput.isEmpty()) {
            System.out.println("Please enter a valid Username : ");
            nameInput = name.nextLine().trim();
        }

        System.out.println("Good luck " + nameInput + " !");
        return nameInput;
    }

    public int getScore() {
        return score;
    }
}
