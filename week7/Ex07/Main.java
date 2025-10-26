package week7.Ex07;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercise 7.1: Class Dictionary
//        Dictionary dictionary = new Dictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("cembalo", "harpsichord");
//
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("porkkana"));

        //Exercise 7.2: Amount of Words
//        Dictionary dictionary = new Dictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        System.out.println(dictionary.amountOfWords());
//
//        dictionary.add("cembalo", "harpsichord");
//        System.out.println(dictionary.amountOfWords());

        //Exercise 7.3: Listing All Words
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }

        //Exercise 7.4: The Beginning of a Text User Interface
//        Scanner reader = new Scanner(System.in);
//        Dictionary dict = new Dictionary();
//
//        TextUserInterface ui = new TextUserInterface(reader, dict);
//        ui.start();

     //   Exercise 7.5: Adding and Translating Words

//        Scanner reader = new Scanner(System.in);
//        Dictionary dict = new Dictionary();
//
//        TextUserInterface ui = new TextUserInterface(reader, dict);
//        ui.start();

        //test
        String input = "translate\n" + "monkey\n"  +
                "translate\n" + "cheese\n" +
                "add\n"  + "cheese\n" + "juusto\n" +
                "translate\n" + "cheese\n" +
                "quit\n";

        Scanner reader = new Scanner(input);
        Dictionary dictionary2 = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary2);
        ui.start();
    }
}
