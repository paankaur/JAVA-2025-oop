package week2;

import java.util.Scanner;

public class Ex30{
    public static void main(String[] args) {
        System.out.print("Type a number, 50 max ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {

            if (number <= 50) {
                System.out.println(i);
            }else System.out.println(i + " I asked you to keep it low ..");
        }
    }
}
