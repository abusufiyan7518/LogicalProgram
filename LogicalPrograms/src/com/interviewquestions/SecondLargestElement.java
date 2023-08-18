package com.interviewquestions;

public class SecondLargestElement {
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 9, 34};
        int secondLargestNumber = findSecondLargest(numbers);
        System.out.println("Second largest element: " + secondLargestNumber);
    }
}
