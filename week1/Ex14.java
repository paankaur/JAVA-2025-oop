package week1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please test a number: ");
        int result = Integer.parseInt(input.nextLine());
        if (result < 0) {
            System.out.println("Your number is negative");
        } else  {
            System.out.println("Your number is positive");
        }
    }
}
