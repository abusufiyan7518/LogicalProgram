package com.interviewquestions;

public class LargestElement {
    public static int findLargest(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 9, 34};
        int largestNumber = findLargest(numbers);
        System.out.println("Largest element: " + largestNumber);
    }
}
