package com.logical.array;

public class ArrayLogicalProgram13 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10 };
		int[] reversedArr = reverseArray(arr);

		System.out.print("Reversed array: ");
		for (int num : reversedArr) {
			System.out.print(num + " ");
		}
	}

	public static int[] reverseArray(int[] arr) {
		int[] reversed = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			reversed[i] = arr[arr.length - i - 1];
		}

		return reversed;
	}
}
