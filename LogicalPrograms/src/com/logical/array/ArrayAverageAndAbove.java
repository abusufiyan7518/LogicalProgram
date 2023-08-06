package com.logical.array;

public class ArrayAverageAndAbove {
    public static void main(String[] args) {
        int[] array = { 12, 5, 20, 8, 16, 9 };

        double average = calculateAverage(array);
        System.out.println("The average of elements in the array is: " + average);

        System.out.println("Elements above the average are:");
        findAboveAverage(array, average);
    }

    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static void findAboveAverage(int[] arr, double average) {
        for (int num : arr) {
            if (num > average) {
                System.out.println(num);
            }
        }
    }
}
