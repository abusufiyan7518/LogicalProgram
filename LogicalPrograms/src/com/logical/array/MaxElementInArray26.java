package com.logical.array;

public class MaxElementInArray26 {
    public static void main(String[] args) {
        int[] array = { 5, 2, 9, 1, 5, 6 };
        
        int max = findMaxElement(array);
        
        System.out.println("The maximum element in the array is: " + max);
    }
    
    public static int findMaxElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }
        
        int max = arr[0]; // Assume the first element is the maximum
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
}
