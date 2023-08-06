package com.logical.array;

public class ArrayLogicalProgram21 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int elementToSearch = 7;
        int index = binarySearchRecursive(arr, elementToSearch, 0, arr.length - 1);
        
        if (index != -1) {
            System.out.println("Element " + elementToSearch + " found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearchRecursive(arr, target, mid + 1, right);
            } else {
                return binarySearchRecursive(arr, target, left, mid - 1);
            }
        }
        
        return -1;
    }
}
