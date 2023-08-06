package com.logical.array;

public class ArrayLogicalProgram07 {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 2, 5, 1, 4 };
        int target = 7;
        
        findPairsWithSum(arr, target);
    }
    
    public static void findPairsWithSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
