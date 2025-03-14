package fr.ynov.java.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a word : ");
        String s = scanner.nextLine();

        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        System.out.println(reversed);
        if (s.equals(reversed)) {
            System.out.println("Its a Palindrome !");
        } else {
            System.out.println("Not a palindrome...");
        }
    }

}
