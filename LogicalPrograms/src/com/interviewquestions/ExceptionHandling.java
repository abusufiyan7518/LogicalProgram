package com.interviewquestions;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
