package com.logical.array;

public class ArrayLogicalProgram09 {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 3, 7, 2, 8, 4, 1, 6 };
        int missingNumber = findMissingNumber(arr, arr.length + 1);
        
        System.out.println("The missing number is: " + missingNumber);
    }
    
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        
        for (int num : arr) {
            arrSum += num;
        }
        
        return totalSum - arrSum;
    }
}
