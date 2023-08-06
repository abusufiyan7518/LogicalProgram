package com.logical.array;

public class ArrayLogicalProgram16 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 3, 9, 1 };
        int secondSmallest = findSecondSmallest(arr);
        
        System.out.println("The second smallest element is: " + secondSmallest);
    }
    
    public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }
}
