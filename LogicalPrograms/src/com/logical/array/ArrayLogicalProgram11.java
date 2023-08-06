package com.logical.array;

public class ArrayLogicalProgram11 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 8, 1 };
        int secondLargest = findSecondLargest(arr);
        
        System.out.println("The second largest element is: " + secondLargest);
    }
    
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
