package com.logical.string;

import java.util.Random;
import java.util.Scanner;

public class DiceRollingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Dice Rolling Game!");
        System.out.print("Enter the name of Player 1: ");
        String player1 = scanner.nextLine();
        System.out.print("Enter the name of Player 2: ");
        String player2 = scanner.nextLine();

        int player1Roll = rollDice();
        int player2Roll = rollDice();

        System.out.println(player1 + " rolled: " + player1Roll);
        System.out.println(player2 + " rolled: " + player2Roll);

        if (player1Roll > player2Roll) {
            System.out.println(player1 + " wins!");
        } else if (player2Roll > player1Roll) {
            System.out.println(player2 + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }

    public static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1; // Generates a random number between 1 and 6
    }
}
