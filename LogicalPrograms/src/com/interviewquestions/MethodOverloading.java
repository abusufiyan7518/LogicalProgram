package com.interviewquestions;

public class MethodOverloading {
	public static int add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		int intSum = add(5, 10);
		double doubleSum = add(3.5, 2.7);

		System.out.println("Sum of integers: " + intSum);
		System.out.println("Sum of doubles: " + doubleSum);
	}
}
