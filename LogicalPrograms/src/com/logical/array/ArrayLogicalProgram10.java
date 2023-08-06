package com.logical.array;

public class ArrayLogicalProgram10 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int gcd = calculateGCD(arr);
        
        System.out.println("GCD of the array elements is: " + gcd);
    }
    
    public static int calculateGCD(int[] arr) {
        int result = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }
        
        return result;
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return gcd(b, a % b);
    }
}
