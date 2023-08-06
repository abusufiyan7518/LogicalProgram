package com.logical.array;

import java.util.Random;

public class FisherYatesShuffle30 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Original array:");
        printArray(array);

        shuffleArray(array);

        System.out.println("\nShuffled array:");
        printArray(array);
    }

    public static void shuffleArray(int[] arr) {
        Random rand = new Random();
        
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
