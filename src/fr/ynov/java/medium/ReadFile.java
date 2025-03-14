package fr.ynov.java.medium;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("Headlock"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

    }
}
