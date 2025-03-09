package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {

    static int square(int number) {
        Integer result = number * number;
        System.out.println(number + " * " + number + " = " + result);
        return result;
    }
    public static void main(String[] args) {
        square(679);
    }
}
