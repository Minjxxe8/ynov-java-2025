package fr.ynov.java.medium;

public class Quality {

    public Integer id;
    public String name;

    public Quality(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Quality q = new Quality(1, "Yes");
        Quality q2 = new Quality(1, "Yes");

        System.out.println(q == q2);
    }
}
