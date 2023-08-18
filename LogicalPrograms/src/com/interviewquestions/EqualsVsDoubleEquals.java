package com.interviewquestions;

public class EqualsVsDoubleEquals {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");

		boolean isEqualUsingEquals = str1.equals(str2); // Compares content
		boolean isEqualUsingDoubleEquals = str1 == str2; // Compares references

		System.out.println("Using equals: " + isEqualUsingEquals);
		System.out.println("Using ==: " + isEqualUsingDoubleEquals);

//		String str3 = "hello";
//		String str4 = "hello";
//		String str5 = new String("hello");
//
//		// Reference equality
//		boolean refEquality = (str5 == str4); // true
//		boolean refInequality = (str5 == str5); // false
//
//		// Value equality
//		boolean valueEquality1 = str5.equals(str4); // true
//		boolean valueEquality2 = str5.equals(str5); // true

	}
}
