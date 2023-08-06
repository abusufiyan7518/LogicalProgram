package com.logical.array;

public class ArrayLogicalProgram18 {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        int mode = findMode(arr);
        
        System.out.println("The mode of the array is: " + mode);
    }
    
    public static int findMode(int[] arr) {
        int[] count = new int[11]; // Array to store the count of each element (0-10)
        
        for (int num : arr) {
            count[num]++;
        }
        
        int mode = 0;
        int maxCount = 0;
        
        for (int i = 1; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mode = i;
            }
        }
        
        return mode;
    }
}
