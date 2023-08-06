package com.logical.array;

public class ArrayLogicalProgram24 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] rotatedArr = rotateLeft(arr, 2);
        
        System.out.print("Rotated array: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] rotateLeft(int[] arr, int k) {
        int n = arr.length;
        int[] rotated = new int[n];
        
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }
        
        return rotated;
    }
}
