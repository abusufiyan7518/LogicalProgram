package com.logical.array;

public class ArrayLogicalProgram05 {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        int mostFrequent = findMostFrequentElement(arr);
        
        System.out.println("The most frequent element in the array is: " + mostFrequent);
    }
    
    public static int findMostFrequentElement(int[] arr) {
        int mostFrequent = 0;
        int maxFrequency = 0;

        for (int i = 0; i < arr.length; i++) {
            int frequency = 1;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }
            
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequent = arr[i];
            }
        }

        return mostFrequent;
    }
}
