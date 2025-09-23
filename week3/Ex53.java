package week3;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        System.out.print("Type a word ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.print("Length of the first part? ");
        int firstPart = input.nextInt();
        String result = word.substring(0, firstPart);
        System.out.println("Result: " + result);

    }
}
