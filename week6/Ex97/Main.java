package week6.Ex97;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
        System.out.println();
        System.out.println(Arrays.toString(array));
    }

    public static void printElegantly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}

