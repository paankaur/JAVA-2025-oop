package week2;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        // list of even numbers 2 - 100
        Scanner input = new Scanner(System.in);
        System.out.print("type 'go' to begin.. ");
        String start = input.nextLine();
        if (start.equalsIgnoreCase("go")) {
            int go = 2;
            while(go <= 100) {
                System.out.println(go);
                go=go+2;
            }
        }

    }
}
