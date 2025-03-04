package fr.ynov.java.easy;

public class Arrays {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
