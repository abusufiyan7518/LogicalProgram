package com.logical.string;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        // Question 1
        System.out.println("\nQuestion 1: What is the capital of France?");
        System.out.println("a) London");
        System.out.println("b) Paris");
        System.out.println("c) Rome");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) Paris.");
        }

        // Question 2
        System.out.println("\nQuestion 2: Which planet is known as the Red Planet?");
        System.out.println("a) Venus");
        System.out.println("b) Mars");
        System.out.println("c) Jupiter");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) Mars.");
        }

        // Calculate final score
        System.out.println("\nYour final score is: " + score + "/2");

        scanner.close();
    }
}
