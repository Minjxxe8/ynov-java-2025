package fr.ynov.java.easy;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner operator = new Scanner(System.in);
        System.out.println("Choose an operator : ");
        String operatorinput = operator.nextLine();

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
           numbers[i] = Integer.parseInt(args[i]);
        }

        Integer one = numbers[0];
        Integer two = numbers[1];
        Integer three = numbers[2];
        Integer four = numbers[3];

        Integer[] possibility = {one, two, three, four};

        Random random = new Random();

        Integer first = possibility[random.nextInt(possibility.length)];
        Integer second = possibility[random.nextInt(possibility.length)];


        Integer result = 0;
        if (operatorinput.equals("+")) {
            result = first + second;
            System.out.println(first + " + " + second + " = " + result);
        } else if (operatorinput.equals("-")) {
            result = first - second;
            System.out.println(first + " - " + second + " = " + result);
        } else if (operatorinput.equals("*")) {
            result = first * second;
            System.out.println(first + " * " + second + " = " + result);
        } else if (operatorinput.equals("/")) {
            result = first / second;
            System.out.println(first + " / " + second + " = " + result);
        } else if (operatorinput.equals("%")) {
            result = first % second;
            System.out.println(first + " % " + second + " = " + result);
        } else {
            System.out.println("Your operator is not recognized");
        }
    }
}
