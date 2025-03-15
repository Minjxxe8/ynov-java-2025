package fr.ynov.java.game;

import java.util.Scanner;

public class Choices {

   String choice;

   public Choices() {
       this.choice = Playerchoice();
   }

   public String Playerchoice() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int number = sc.nextInt();

       String choice = switch (number) {
           case 1 -> "rock";
           case 2 -> "paper";
           case 3 -> "scissors";
           default -> "";
       };

       if (number < 1 || number > 3) {
           System.out.println("Invalid Choice, please choose a number between 1 and 3");
           return Playerchoice();
       }
       return choice;
   }
}
