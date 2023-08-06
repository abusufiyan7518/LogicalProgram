package com.logical.array;

public class MajorityElement29 {
    public static void main(String[] args) {
        int[] array = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };

        int majority = findMajorityElement(array);

        if (majority != -1) {
            System.out.println("The majority element in the array is: " + majority);
        } else {
            System.out.println("No majority element found in the array.");
        }
    }

    public static int findMajorityElement(int[] arr) {
        int candidate = -1;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1; // No majority element
        }
    }
}
