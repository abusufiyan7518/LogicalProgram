package com.interviewquestions;

public class Power {
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 4;
        int result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}
