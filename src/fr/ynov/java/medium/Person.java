package fr.ynov.java.medium;

import java.time.LocalDate;
import java.util.Date;

public class Person {

    public String name;
    public String birthDate;
    public String gender;
    public float height;
    public country nationality;

    public enum country {
        FRANCE, GERMANY, ITALY
    }


    public Person(String name, String gender, float height, country nationality, String birthDate) {
       this.name = name;
       this.birthDate = birthDate;
       this.gender = gender;
       this.height = height;
       this.nationality = nationality;
    }

    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " cm");
        System.out.println("Nationality: " + nationality);
    }

    public String getName() {
        return name;
    }
    public long getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(this.birthDate); // YYYY-MM-DD
        long result = today.getYear() - birthDate.getYear();
        return result;
    }
    public String getGender() {
        return gender;
    }
    public float getHeight() {
        return height;
    }


    public static void main(String[] args) {
        Person person = new Person("Léna", "Female", 165, country.ITALY, "2006-10-08");
        person.Display();
    }
}
