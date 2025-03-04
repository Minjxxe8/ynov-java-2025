package fr.ynov.java.easy;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Choose a number : ");
        int numberinput = number.nextInt();

        if (numberinput % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
