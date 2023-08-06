package com.logical.array;

public class ArrayLogicalProgram19 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int maxProduct = findMaxProduct(arr);
        
        System.out.println("The maximum product of two elements is: " + maxProduct);
    }
    
    public static int findMaxProduct(int[] arr) {
        int maxProduct = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        
        return maxProduct;
    }
}
