package week7.Ex07;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dict) {
    this.reader = reader;
    this.dict = dict;
    }

    public String trimNoCaps(String str) {
        return str.trim().toLowerCase();
    }

    public String getInput(){
        return reader.nextLine();
    }

    public void start(){

        System.out.println();
        System.out.println("write 'add' to add a word pair to the dictionary");
        System.out.println("write 'translate' to translate a word");
        System.out.println("write 'quit' to exit user interface");

        while(true){
            String  input = getInput();
            input = trimNoCaps(input);
         //   System.out.println("Statement: " + input);
            if(input.equals("quit")){
                System.out.println("Cheers!");
                break;} else if (input.equals("add")) {
                add();
            } else if (input.equals("translate")) {
                translate();
            }
            else{
                System.out.println("unknown statement");
            }
        }
    }
    public void add(){
        System.out.println();
      //  System.out.println("Statement: add");
        System.out.print("In Finnish: ");
        String finInput = getInput();
        finInput = trimNoCaps(finInput);
      //  System.out.print(finInput);
        System.out.print("Translation: ");
        String translationInput = getInput();
        translationInput = trimNoCaps(translationInput);
     //   System.out.print("Statement: ");

        dict.add(finInput, translationInput);
    }
    public void translate(){
        System.out.println();
        System.out.print("In Finnish: ");
        String finInput = getInput();
        finInput = trimNoCaps(finInput);
        System.out.print("Translation: " + dict.translate(finInput));
        System.out.println();

    }

}
