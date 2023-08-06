package com.logical.string;

import java.util.Scanner;

class Question {
    String prompt;
    String answer;

    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }
}

public class QuizGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Question[] questions = {
            new Question("What is the capital of France?\n(a) Paris\n(b) London\n(c) Rome", "a"),
            new Question("Which planet is known as the Red Planet?\n(a) Venus\n(b) Mars\n(c) Jupiter", "b"),
            new Question("What is the largest mammal?\n(a) Elephant\n(b) Blue Whale\n(c) Giraffe", "b")
        };

        int score = 0;

        for (Question question : questions) {
            System.out.println(question.prompt);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(question.answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.answer + "\n");
            }
        }

        System.out.println("You scored " + score + "/" + questions.length);

        scanner.close();
    }
}
