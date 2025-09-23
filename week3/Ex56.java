package week3;

import java.util.Scanner;

public class Ex56 {
    public static String reverse(String text) {
        StringBuilder reversed = new StringBuilder();
        return reversed.append(text).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text (e.g. kuuli lennutee tunneli luuk): ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));

    }
}
