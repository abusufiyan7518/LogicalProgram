package com.logical.array;

public class ArrayLogicalProgram03 {
    public static void main(String[] args) {
        int[] numbers = { 10, 7, 3, 5, 2 };
        int target = 12;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Pair found: (" + numbers[i] + ", " + numbers[j] + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found with the given target sum.");
        }
    }
}
