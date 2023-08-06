package com.logical.array;

public class ArrayLogicalProgram12 {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 1, 4, 8 };
        int smallestDifference = findSmallestDifference(arr);
        
        System.out.println("The smallest difference between any two elements is: " + smallestDifference);
    }
    
    public static int findSmallestDifference(int[] arr) {
        int smallestDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < smallestDiff) {
                    smallestDiff = diff;
                }
            }
        }
        
        return smallestDiff;
    }
}
