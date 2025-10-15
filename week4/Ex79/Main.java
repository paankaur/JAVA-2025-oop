package week4.Ex79;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        /*stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);*/
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());
        System.out.println("Type numbers: ");
        Scanner input = new Scanner(System.in);
        int inputNumbers = input.nextInt();

// Exercise 79.3: Asking for numbers from the user
        while (inputNumbers != -1) {
            stats.addNumber(inputNumbers);
            inputNumbers = input.nextInt();
//            System.out.println(inputNumbers);
        } System.out.println("sum: " + stats.sum());


//Exercise 79.4: Many sums
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();
        NumberStatistics statsBoth = new NumberStatistics();

        System.out.println("Type numbers: ");
        int inputNumbers2 = input.nextInt();
        while (inputNumbers2 != -1) {
            statsBoth.addNumber(inputNumbers2);
            if (inputNumbers2 % 2 == 0) {
                statsEven.addNumber(inputNumbers2);
            }  else {statsOdd.addNumber(inputNumbers2);}

            inputNumbers2 = input.nextInt();
        }
        System.out.println("sum: " + statsBoth.sum());
        System.out.println("sum of even: " + statsEven.sum());
        System.out.println("sum of odd: " + statsOdd.sum());
    }
}