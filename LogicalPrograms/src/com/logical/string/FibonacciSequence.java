package com.logical.string;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10; 

        System.out.println("Fibonacci sequence of " + n + " numbers:");
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
