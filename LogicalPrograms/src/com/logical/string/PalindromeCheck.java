package com.logical.string;

public class PalindromeCheck{
    public static void main(String[] args) {
        String palindromeString = "radar";
        String nonPalindromeString = "hello";

        System.out.println("Is '" + palindromeString + "' a palindrome? " + isPalindrome(palindromeString));
        System.out.println("Is '" + nonPalindromeString + "' a palindrome? " + isPalindrome(nonPalindromeString));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
