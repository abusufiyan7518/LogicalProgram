package com.trickyques.sometimes;

public class Buffer {
	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Aamir");
		StringBuilder sb2 = new StringBuilder("Akmir");

		String output = checkContentIsEqualOrNot(sb1, sb2) ? "content Same !" : "content not same!";
		System.out.println(output);
	}

	private static boolean checkContentIsEqualOrNot(StringBuilder sb1, StringBuilder sb2) {
		if (sb1.length() != sb2.length()) {
			return false;
		}
		for (int i = 0; i < sb1.length(); i++) {
			if (sb1.charAt(i) != sb2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
