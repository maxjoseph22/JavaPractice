// 👉 Write a program that keeps asking the user to guess a number between 1 and 10 until they guess correctly.

import java.util.Scanner;

public class numberGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int realNumber = 9;
        System.out.println("What is your guess between 1 and 10?");
        int guess = scanner.nextInt();
        while (guess != realNumber) {
            System.out.println("Wrong! Guess again.");
            guess = scanner.nextInt();
        }
        System.out.println("Correct!");

    }
}