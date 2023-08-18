package com.interviewquestions;

public class Factors {
    public static void main(String[] args) {
        int number = 24;

        System.out.print("Factors of " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
