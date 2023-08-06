package com.logical.string;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ".");
        
        int numberOfGuesses = 0;
        int playerGuess;
        
        do {
            System.out.print("Enter your guess: ");
            playerGuess = scanner.nextInt();
            numberOfGuesses++;

            if (playerGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else if (playerGuess > randomNumber) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + numberOfGuesses + " guesses.");
            }
        } while (playerGuess != randomNumber);

        scanner.close();
    }
}
