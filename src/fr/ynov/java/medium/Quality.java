package fr.ynov.java.medium;

import java.util.Objects;

public class Quality {

    public Integer id;
    public String name;

    public Quality(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Quality quality = (Quality) o;
        return Objects.equals(id, quality.id) && Objects.equals(name, quality.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Quality q = new Quality(1, "Yes");
        Quality q2 = new Quality(1, "Yes");

        System.out.println(q.equals(q2));
    }
}
