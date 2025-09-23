package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        int endex = 0;
        while (endex < 1) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if(words.contains(word)){
                endex = 1;
                System.out.println("You gave the word " + word + " twice.");
            }
            words.add(word);
        }
    }
}