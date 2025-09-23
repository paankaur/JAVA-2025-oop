package week3;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        System.out.print("Hello, please type your name here: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if (name.length() > 2){
            for (int i = 0; i <= 2; i++){
                System.out.println(name.charAt(i));
            }
        }else System.out.println("This program printed nothing :)");
    }
}
