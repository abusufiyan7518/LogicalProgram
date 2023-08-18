package com.roomtest;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 10, };
		int[] reversed = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reversed[i] = arr[arr.length - i - 1];
			int r = reversed[i];
			System.out.println(r);
		}
	}
}
0