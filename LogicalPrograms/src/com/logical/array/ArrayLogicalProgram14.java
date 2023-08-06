package com.logical.array;

public class ArrayLogicalProgram14 {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 8, 3, 2, 7, 6, 9 };
        int[] uniqueArr = removeDuplicates(arr);
        
        System.out.print("Array with duplicates removed: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] removeDuplicates(int[] arr) {
        int[] unique = new int[arr.length];
        int count = 0;
        
        for (int num : arr) {
            boolean isDuplicate = false;
            
            for (int i = 0; i < count; i++) {
                if (num == unique[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                unique[count] = num;
                count++;
            }
        }
        
        int[] result = new int[count];
        System.arraycopy(unique, 0, result, 0, count);
        return result;
    }
}
