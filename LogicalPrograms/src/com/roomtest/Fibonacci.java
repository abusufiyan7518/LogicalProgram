package com.roomtest;

import java.util.Scanner;

public class Fibonacci {
	static int a = 0, b = 1, c, i, count = 10;

	public static void main(String[] args) {
		System.out.println(a + " " + b);

		for (int i = 2; i < count; i++) {
			c = a + b;
			System.out.println(c + " ");

			a = b;
			b = c;

		}
	}
}
0