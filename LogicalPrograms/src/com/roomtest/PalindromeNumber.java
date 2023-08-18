package com.roomtest;

public class PalindromeNumber {
	public static void main(String[] args) {
		int r, sum = 0, n = 454, temp;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}
	}
}
0