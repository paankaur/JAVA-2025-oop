package week3;

import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        System.out.print("Type the first word: ");
        Scanner input = new Scanner(System.in);
        String word1 = input.nextLine();
        System.out.print("Type the second word: ");

        String word2 = input.nextLine();

        if (word1.indexOf(word2) != -1) {
            System.out.println("The word " + word2 + " is found in the word " + word1);
        }else {System.out.println("The word " + word2 + " is not found in the word " + word1);}
    }
}
