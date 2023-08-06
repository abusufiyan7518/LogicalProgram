package com.logical.array;

public class ArrayLogicalProgram22 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 2, 1, 4 };
        int maxElement = findMaxElement(arr);
        
        System.out.println("The maximum element in the array is: " + maxElement);
    }
    
    public static int findMaxElement(int[] arr) {
        int max = arr[0];
        
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        
        return max;
    }
}
