package com.logical.array;

public class ArrayLogicalProgram04 {
    public static void main(String[] args) {
        int[] numbers = { 2, 5, 7, 8, 10 };
        int target = 15;

        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == target) {
                        System.out.println("Triplet found: (" + numbers[i] + ", " + numbers[j] + ", " + numbers[k] + ")");
                    }
                }
            }
        }
    }
}
