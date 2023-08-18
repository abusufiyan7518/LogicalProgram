package com.interviewquestions;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] array1 = {3, 7, 9, 2, 5};
        int[] array2 = {5, 2, 8, 1};

        Set<Integer> intersection = new HashSet<>();
        for (int num : array1) {
            for (int value : array2) {
                if (num == value) {
                    intersection.add(num);
                }
            }
        }

        System.out.println("Intersection: " + intersection);
    }
}
