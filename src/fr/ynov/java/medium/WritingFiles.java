package fr.ynov.java.medium;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class WritingFiles {

    public static void main(String[] args) throws IOException {
        Scanner headlock = new Scanner(new File("Headlock"));
       try {
           BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Headlock2"));
           while (headlock.hasNextLine()) {
               String line = headlock.nextLine();
               bufferedWriter.write(line + "\n");
           }
           bufferedWriter.close();
       } catch (IOException ioe) {
           System.out.println("Couldn't write to file");
       }

    }
}
