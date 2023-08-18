package com.interviewquestions;

class MathUtils {
    static int multiply(int a, int b) {
        return a * b;
    }

    static final double PI = 3.14159;
}

public class StaticExample {
    public static void main(String[] args) {
        int product = MathUtils.multiply(5, 3);
        System.out.println("Product: " + product);

        double circleArea = MathUtils.PI * 2 * 2;
        System.out.println("Circle area: " + circleArea);
    }
}
