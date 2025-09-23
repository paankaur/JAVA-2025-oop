package week3;

import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        System.out.print("Type a word ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.print("Length of the last part? ");
        int lastPart = input.nextInt();
        String result = word.substring(word.length()-lastPart);
        System.out.println("Result: " + result);

    }
}
