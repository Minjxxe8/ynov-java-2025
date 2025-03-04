package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("What's your name?");
        String nameinput = name.nextLine();
        System.out.println("Your name is " + nameinput);

        Scanner age = new Scanner(System.in);
        System.out.println("What's your age?");
        int ageNumber = age.nextInt();
        System.out.println("Your age is " + ageNumber);
    }

}
