package com.logical.array;

public class ArrayLogicalProgram02 {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of elements in the array is: " + sum);

        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i];
        }

        System.out.println("The product of elements in the array is: " + product);
    }
}
