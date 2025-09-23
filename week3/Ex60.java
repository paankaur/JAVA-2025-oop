package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        int endex = 1;
        while (endex > 0) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            words.add(word);
            if(word.isEmpty()) {
                endex = 0;
                words.remove("");
            }
        }
        System.out.println("You typed the following words:");
        Collections.sort(words);
        for(String wor : words) {
            System.out.println(wor);

        }
    }
}
