package com.logical.array;

public class PalindromeArray27 {
    public static void main(String[] args) {
        int[] palindromeArray = { 1, 2, 3, 2, 1 };
        int[] nonPalindromeArray = { 1, 2, 3, 4, 5 };

        System.out.println("Palindrome array:");
        printArray(palindromeArray);
        System.out.println("Is palindrome: " + isPalindrome(palindromeArray));

        System.out.println("\nNon-palindrome array:");
        printArray(nonPalindromeArray);
        System.out.println("Is palindrome: " + isPalindrome(nonPalindromeArray));
    }

    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
