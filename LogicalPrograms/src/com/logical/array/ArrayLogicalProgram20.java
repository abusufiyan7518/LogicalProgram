package com.logical.array;

public class ArrayLogicalProgram20 {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 8, 4, 6, 1, 5 };
        int[] sortedArr = insertionSort(arr);
        
        System.out.print("Sorted array: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;
        }
        
        return arr;
    }
}
