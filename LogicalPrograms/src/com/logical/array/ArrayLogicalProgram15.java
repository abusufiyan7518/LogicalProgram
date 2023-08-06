package com.logical.array;

public class ArrayLogicalProgram15 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int target = 14;
        boolean found = findPairWithSum(arr, target);
        
        if (found) {
            System.out.println("A pair with the target sum exists.");
        } else {
            System.out.println("No pair with the target sum found.");
        }
    }
    
    public static boolean findPairWithSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
