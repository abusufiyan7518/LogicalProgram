package com.logical.array;

public class ArrayLogicalProgram01 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 3 };
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The minimum element in the array is: " + min);
        System.out.println("The maximum element in the array is: " + max);
    }
}
