package fr.ynov.java.medium;

public class Person {

    public String name;
    public int age;
    public String gender;
    public float height;
    public country nationality;

    public enum country {
        FRANCE, GERMANY, ITALY
    }


    public Person(String name, int age, String gender, float height, country nationality) {
       this.name = name;
       this.age = age;
       this.gender = gender;
       this.height = height;
       this.nationality = nationality;
    }

    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " cm");
        System.out.println("Nationality: " + nationality);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public float getHeight() {
        return height;
    }


    public static void main(String[] args) {
        Person person = new Person("Léna", 18, "Female", 165, country.ITALY);
        person.Display();
    }
}
