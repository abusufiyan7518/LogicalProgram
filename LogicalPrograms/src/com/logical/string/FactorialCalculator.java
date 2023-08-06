package com.logical.string;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorialRecursive = computeFactorialRecursive(n);
            long factorialIterative = computeFactorialIterative(n);

            System.out.println("Factorial of " + n + " (recursive): " + factorialRecursive);
            System.out.println("Factorial of " + n + " (iterative): " + factorialIterative);
        }
        
        scanner.close();
    }

    public static long computeFactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * computeFactorialRecursive(n - 1);
    }

    public static long computeFactorialIterative(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
