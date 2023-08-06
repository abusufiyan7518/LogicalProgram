package com.logical.array;

public class ArrayLogicalProgram17 {
    public static void main(String[] args) {
        int[] arr = {  8, 2, 7, 6, 4 };
        int[] rotatedArr = rotateArray(arr, 2);
        
        System.out.print("Rotated array: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        int[] rotated = new int[n];
        
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }
        
        return rotated;
    }
}
