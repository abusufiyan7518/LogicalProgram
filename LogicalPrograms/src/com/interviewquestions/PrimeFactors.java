package com.interviewquestions;

public class PrimeFactors {
    public static void main(String[] args) {
        int number = 56;

        System.out.print("Prime factors of " + number + ": ");
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
    }
}

