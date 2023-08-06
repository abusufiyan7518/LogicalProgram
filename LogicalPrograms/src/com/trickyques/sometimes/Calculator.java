package com.trickyques.sometimes;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		int number = sc.nextInt();
		System.out.println("choose operator: +,-,*,/");
		char operator = sc.next().charAt(0);
		System.out.println("enter second number:");
		int number1 = sc.nextInt();
		switch (operator) {
		case '+':
			System.out.println(number2 = number + number1);
			break;
		case '-':
			System.out.println(number2 = number - number1);
			break;
		case '*':
			System.out.println(number2 = number * number1);
			break;
		case '/':
			System.out.println(number2 = number / number1);
			break;
		default:
			System.out.println("invalid symbol.....");
		}
		sc.close();
	}
}
